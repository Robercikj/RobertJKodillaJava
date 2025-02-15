package com.kodilla.hibernate.invoice.dao;


import com.kodilla.kodilla.spring.web.hibernate.invoice.Invoice;
import com.kodilla.kodilla.spring.web.hibernate.invoice.Item;
import com.kodilla.kodilla.spring.web.hibernate.invoice.Product;
import jakarta.transaction.Transactional;

import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {



    Product product = new Product("Laptop");
    Product product1 = new Product("Smartphone");


    Item item = new Item(1, product, new BigDecimal("1000"), 1, new BigDecimal("1000"));
    Item item1 = new Item(2, product, new BigDecimal("5000"), 1, new BigDecimal("5000"));


    Invoice invoice = new Invoice();
    invoice.add(item);
    invoice.add(item1);

    InvoiceDao.save();
    int invoiceId = invoice.getId();

    Optional<Invoice> savedInvoices = invoiceDao.findById(invoiceId);
    assertTrue(savedInvices.isPresent());
    assertEquals(2,savedInvoices.get().getItems().size());

    invoiceDao.deleteById();



}
