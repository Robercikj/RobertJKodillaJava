package com.kodilla.kodilla.spring.web.hibernate.invoice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Invoice {
    @Id
    int id;
    String number;
    @OneToMany(mappedBy = "invoice")
    List<Item> items = new ArrayList<Item>();

    public Invoice() {}

    public Invoice(int id, String number, List<Item> items) {
        this.id = id;
        this.number = number;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
