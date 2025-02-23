package com.kodilla.hibernate.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyRepository;
import com.kodilla.hibernate.manytomany.dao.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void cleanUp() {
        companyRepository.deleteAll();
    }

    @Test
    void testFindByFirstThreeLetters() {
        Company company1 = new Company();
        company1.setName("Techleader");
        companyRepository.save(company1);

        Company company2 = new Company();
        company2.setName("ByteLeaDER");
        companyRepository.save(company2);

        List<Company> result = companyRepository.findByFirstThreeLetters("tec");
        assertEquals(1, result.size());
        assertEquals("Techleader", result.get(0).getName());
    }

    @BeforeEach
    void cleanUp1() {
        employeeRepository.deleteAll();
    }
    @Test
    void testFindByLastName() {
        Employee employee1 = new Employee();
        employee1.setFirstName("John");
        employee1.setLastName("Smith");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Jane");
        employee2.setLastName("Smith");
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Artiem");
        employee3.setLastName("Dobyk");
        employeeRepository.save(employee3);

        List<Employee> names = employeeRepository.findByLastName("Smith");
        assertEquals(2, names.size());
        assertEquals("Smith", names.get(0).getLastName());
    }
}