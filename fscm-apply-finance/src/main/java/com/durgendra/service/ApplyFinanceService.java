package com.durgendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.durgendra.entity.ApplyFinance;
import com.durgendra.repository.ApplyFinanceRepo;
import com.durgendra.util.InvoiceEntry;
import com.durgendra.util.ResponseDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ApplyFinanceService {
	
	@Autowired
	private ApplyFinanceRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseDto getApplyFinance(Long id) {
		ApplyFinance data=  repo.findById(id).get();
		
		ResponseEntity<InvoiceEntry> invoiceEntry = restTemplate.getForEntity("http://FSCM-INVOICE-ENTRY/invoice-entry/"+data.getInvoice_id(), InvoiceEntry.class);
		ResponseDto dto = new ResponseDto(data,invoiceEntry.getBody());
		log.info("find by id :{}", data);
		return dto;
	}
	
	public ApplyFinance saveApplyFinance(ApplyFinance finance) {
		ApplyFinance data=  repo.save(finance);
		log.info("saved finance :{}", data);
		return data;
	}
	
	public ApplyFinance updateApplyFinance(ApplyFinance finance) {
		ApplyFinance data=  repo.save(finance);
		log.info("updated finance :{}", data);
		return data;
	}
	
	public List<ApplyFinance> getAllApplyFinance() {
		List<ApplyFinance> data=  repo.findAll();
		log.info("all finance :{}", data);
		return data;
	}
	
	public ApplyFinance deleteApplyFinance(Long id) {
		ApplyFinance data=  repo.getOne(id);
		log.info("delete by id :{}", data);
		repo.deleteById(id);
		return data;
	}
	
}
