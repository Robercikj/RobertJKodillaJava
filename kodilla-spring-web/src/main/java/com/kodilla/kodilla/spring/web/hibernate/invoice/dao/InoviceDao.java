package com.kodilla.kodilla.spring.web.hibernate.invoice.dao;

import com.kodilla.kodilla.spring.web.hibernate.invoice.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InoviceDao extends JpaRepository<Invoice, Long> {


}
