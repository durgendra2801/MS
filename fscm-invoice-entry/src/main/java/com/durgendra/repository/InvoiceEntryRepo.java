package com.durgendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.durgendra.entity.InvoiceEntry;

@Repository
public interface InvoiceEntryRepo extends JpaRepository<InvoiceEntry, Long> {

}
