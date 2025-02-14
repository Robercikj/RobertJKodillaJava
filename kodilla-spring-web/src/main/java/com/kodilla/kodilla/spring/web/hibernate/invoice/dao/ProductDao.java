package com.kodilla.kodilla.spring.web.hibernate.invoice.dao;

import com.kodilla.kodilla.spring.web.hibernate.invoice.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}
