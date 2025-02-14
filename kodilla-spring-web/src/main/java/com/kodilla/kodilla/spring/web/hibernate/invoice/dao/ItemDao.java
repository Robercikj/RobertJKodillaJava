package com.kodilla.kodilla.spring.web.hibernate.invoice.dao;

import com.kodilla.kodilla.spring.web.hibernate.invoice.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item, Long> {
}
