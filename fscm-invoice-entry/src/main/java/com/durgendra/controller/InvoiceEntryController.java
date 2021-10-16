package com.durgendra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durgendra.entity.InvoiceEntry;
import com.durgendra.service.InvoiceEntryService;

@RestController
@RequestMapping("/invoice-entry")
public class InvoiceEntryController {
	
	@Autowired
	private InvoiceEntryService service;
	
	@GetMapping("/{id}")
	public InvoiceEntry getInvoiceEntry(@PathVariable Long id) {
		return service.getInvoiceEntry(id);
	}
	
	@PostMapping("/")
	public InvoiceEntry createInvoice(@RequestBody InvoiceEntry invoiceEntry) {
		return service.createInvoice(invoiceEntry);
	}
	
	@PutMapping("/")
	public InvoiceEntry updateInvoice(@RequestBody InvoiceEntry invoiceEntry) {
		return service.updateInvoice(invoiceEntry);
	}
	
	@GetMapping("/getAll")
	public List<InvoiceEntry> getAll(){
		return service.getAll();
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteInvoice(@PathVariable Long id) {
		service.deleteInvoice(id);
		return true;
	}
	
}
