package br.org.catolicasc.jpa.data.exercise.dao;

import br.org.catolicasc.jpa.data.exercise.bean.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
