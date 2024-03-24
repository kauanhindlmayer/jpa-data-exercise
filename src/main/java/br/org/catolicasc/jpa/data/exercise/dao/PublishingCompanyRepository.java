package br.org.catolicasc.jpa.data.exercise.dao;

import br.org.catolicasc.jpa.data.exercise.bean.PublishingCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingCompanyRepository extends CrudRepository<PublishingCompany, Long> {
}
