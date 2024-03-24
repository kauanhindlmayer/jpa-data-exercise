package br.org.catolicasc.jpa.data.exercise;

import br.org.catolicasc.jpa.data.exercise.bean.PublishingCompany;
import br.org.catolicasc.jpa.data.exercise.dao.PublishingCompanyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PublishingCompanyTest {

    @Autowired
    private PublishingCompanyRepository _publishingCompanyRepository;

    @Test
    public void Should_save_publishing_company_in_database() {
        PublishingCompany publishingCompany = new PublishingCompany("Pearson", "");
        _publishingCompanyRepository.save(publishingCompany);
        assertNotNull(publishingCompany.getId());
    }
}
