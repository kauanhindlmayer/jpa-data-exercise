package br.org.catolicasc.jpa.data.exercise.dao;

import br.org.catolicasc.jpa.data.exercise.bean.Book;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>,
        JpaSpecificationExecutor<Book> {

    List<Book> findByTitle(String title);
    @Query("SELECT b FROM Book b LEFT JOIN b.author a WHERE a.name = :authorName")
    List<Book> findByAuthorName(String authorName);
    @Query("SELECT b FROM Book b LEFT JOIN b.publishingCompany pc WHERE pc.name = :publishingCompanyName")
    List<Book> findByPublishingCompanyName(String publishingCompanyName);
}
