package br.org.catolicasc.jpa.data.exercise;

import br.org.catolicasc.jpa.data.exercise.bean.Author;
import br.org.catolicasc.jpa.data.exercise.bean.Book;
import br.org.catolicasc.jpa.data.exercise.bean.PublishingCompany;
import br.org.catolicasc.jpa.data.exercise.dao.AuthorRepository;
import br.org.catolicasc.jpa.data.exercise.dao.BookRepository;
import br.org.catolicasc.jpa.data.exercise.dao.PublishingCompanyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BookTest {

    @Autowired
    private AuthorRepository _authorRepository;

    @Autowired
    private PublishingCompanyRepository _publishingCompanyRepository;

    @Autowired
    private BookRepository _bookRepository;

    @Test
    public void Should_save_book_in_database() {
        // Given
        Author author = new Author("Robert C. Martin", "robert@gmail.com");
        _authorRepository.save(author);

        PublishingCompany publishingCompany = new PublishingCompany("Pearson", "");
        _publishingCompanyRepository.save(publishingCompany);

        // When
        Book book = new Book("Clean Code", author, 2008, publishingCompany);
        _bookRepository.save(book);

        // Then
        assertNotNull(book.getId());
    }

    @Test
    public void Should_find_book_by_title() {
        // Given
        Author author = new Author("Robert C. Martin", "robert@gmail.com");
        _authorRepository.save(author);

        PublishingCompany publishingCompany = new PublishingCompany("Pearson", "");
        _publishingCompanyRepository.save(publishingCompany);

        Book book = new Book("Clean Code", author, 2008, publishingCompany);
        _bookRepository.save(book);

        // When
        List<Book> books = _bookRepository.findByTitle("Clean Code");

        // Then
        assertNotNull(books);
        assertFalse(books.isEmpty());
    }

    @Test
    public void Should_find_book_by_author_name() {
        // Given
        Author author = new Author("Robert C. Martin", "robert@gmail.com");
        _authorRepository.save(author);

        PublishingCompany publishingCompany = new PublishingCompany("Pearson", "");
        _publishingCompanyRepository.save(publishingCompany);

        Book book = new Book("Clean Code", author, 2008, publishingCompany);
        _bookRepository.save(book);

        // When
        List<Book> books = _bookRepository.findByAuthorName("Robert C. Martin");

        // Then
        assertNotNull(books);
        assertFalse(books.isEmpty());
    }

    @Test
    public void Should_find_book_by_publishing_company_name() {
        // Given
        Author author = new Author("Robert C. Martin", "robert@gmail.com");
        _authorRepository.save(author);

        PublishingCompany publishingCompany = new PublishingCompany("Pearson", "");
        _publishingCompanyRepository.save(publishingCompany);

        Book book = new Book("Clean Code", author, 2008, publishingCompany);
        _bookRepository.save(book);

        // When
        List<Book> books = _bookRepository.findByPublishingCompanyName("Pearson");

        // Then
        assertNotNull(books);
        assertFalse(books.isEmpty());
    }
}
