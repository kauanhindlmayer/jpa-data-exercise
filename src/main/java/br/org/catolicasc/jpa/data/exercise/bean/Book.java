package br.org.catolicasc.jpa.data.exercise.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Author author;

    private int yearPublished;

    @ManyToOne
    private PublishingCompany publishingCompany;

    public Book(String title, Author author, int yearPublished, PublishingCompany publishingCompany) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.publishingCompany = publishingCompany;
    }

    public Book() {

    }

    public Long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author.getName() + ", Year Published: " + yearPublished;
    }
}
