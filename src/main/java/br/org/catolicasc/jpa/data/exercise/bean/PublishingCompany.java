package br.org.catolicasc.jpa.data.exercise.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PublishingCompany {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    public PublishingCompany(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public PublishingCompany() {

    }

    public Long getId() {
        return this.id;
    }
}
