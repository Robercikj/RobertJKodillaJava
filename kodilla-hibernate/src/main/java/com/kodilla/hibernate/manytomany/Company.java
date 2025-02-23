package com.kodilla.hibernate.manytomany;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@NamedNativeQuery(
        name = "Company.findByFirstThreeLetters",
        query = "SELECT * FROM company WHERE SUBSTRING(name, 1, 3) = :prefix",
        resultClass = Company.class
)
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}