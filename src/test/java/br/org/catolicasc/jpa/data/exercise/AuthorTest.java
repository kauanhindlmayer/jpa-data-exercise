package br.org.catolicasc.jpa.data.exercise;

import br.org.catolicasc.jpa.data.exercise.bean.Author;
import br.org.catolicasc.jpa.data.exercise.dao.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AuthorTest {

    @Autowired
    private AuthorRepository _authorRepository;

    @Test
    public void Should_save_author_in_database() {
        Author author = new Author("Robert C. Martin", "robert@gmail.com");
        _authorRepository.save(author);
        assertNotNull(author.getId());
    }
}
