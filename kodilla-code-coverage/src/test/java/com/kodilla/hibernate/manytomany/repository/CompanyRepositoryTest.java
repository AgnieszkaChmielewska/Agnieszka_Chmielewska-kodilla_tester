package com.kodilla.hibernate.manytomany.repository;

import org.springframework.beans.factory.annotation.Autowired;

class CompanyRepositoryTest {
    @Autowired
    private CompanyRepository companyRepository;

    String COMPANY_NAME = "Factory";
//
//    @Test
//    void testCompanyRepositoryTestFindByName() {
//
//        //Given
//        Company company = new Company(COMPANY_NAME);
//        companyRepository.save(company);
//        String name = company.getName();
//        System.out.println(name);
//        //When
//        List<Company> readCompany = companyRepository.findByName(name);
//        String foundName = readCompany.get(0).getName();
//
//        //Then
//        Assertions.assertEquals("Factory", foundName);
//
//        //CleanUp
//        companyRepository.deleteAll();
//
//    }
}