package com.durgendra.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durgendra.entity.InvoiceEntry;
import com.durgendra.repository.InvoiceEntryRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InvoiceEntryService {

	@Autowired
	private InvoiceEntryRepo repo;

	public InvoiceEntry getInvoiceEntry(Long id) {

		InvoiceEntry invoice = repo.findById(id).get();
		log.info("find By Id :{}",invoice);
		return invoice;
	}

	public InvoiceEntry createInvoice(InvoiceEntry invoiceEntry) {
		invoiceEntry.setInvoice_date(new Date());
		invoiceEntry.setInvoice_exp_date(new Date());
		InvoiceEntry invoice = repo.save(invoiceEntry);
		log.info("saved invoice :{}",invoice);
		return invoice;
	}

	public InvoiceEntry updateInvoice(InvoiceEntry invoiceEntry) {
		InvoiceEntry invoice = repo.save(invoiceEntry);
		log.info("updated invoice :{}",invoice);
		return invoice;
	}

	public List<InvoiceEntry> getAll(){

		List<InvoiceEntry>  list = repo.findAll();
		log.info("all invoice data :{}",list);
		return list;
	}

	public Boolean deleteInvoice(Long id) {
		repo.deleteById(id);
		return true;
	}

}
