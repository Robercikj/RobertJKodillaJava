package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String number;
    @OneToMany(mappedBy = "invoice")
    List<Item> items = new ArrayList<Item>();

    public Invoice() {}

    public Invoice(Long id, String number, List<Item> items) {
        this.id = id;
        this.number = number;
        this.items = items;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
