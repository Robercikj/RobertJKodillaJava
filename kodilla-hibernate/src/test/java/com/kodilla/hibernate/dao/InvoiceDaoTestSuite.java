package com.kodilla.hibernate.dao;



import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import jakarta.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void shouldSaveInvoice() {


        Product product = new Product("Laptop");
        Product product1 = new Product("Smartphone");


        Item item = new Item(1, product, new BigDecimal("1000"), 1, new BigDecimal("1000"));
        Item item1 = new Item(2, product, new BigDecimal("5000"), 1, new BigDecimal("5000"));


        Invoice invoice = new Invoice();
        invoice.getItems().add(item);
        invoice.getItems().add(item1);

        invoiceDao.save(invoice);
        Long invoiceId = invoice.getId();

        Optional<Invoice> savedInvoices = invoiceDao.findById(invoiceId);
        assertTrue(savedInvoices.isPresent());
        assertEquals(2, savedInvoices.get().getItems().size());

        invoiceDao.deleteById(invoiceId);

    }

}
