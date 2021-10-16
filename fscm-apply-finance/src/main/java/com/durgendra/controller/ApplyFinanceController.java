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

import com.durgendra.entity.ApplyFinance;
import com.durgendra.service.ApplyFinanceService;
import com.durgendra.util.ResponseDto;

@RestController
@RequestMapping("/apply-finance")
public class ApplyFinanceController {
	
	@Autowired
	private ApplyFinanceService applyFinanceService;
	
	@GetMapping("/{id}")
	public ResponseDto getApplyFinance(@PathVariable Long id) {
		return applyFinanceService.getApplyFinance(id);
	}
	
	@PostMapping("/")
	public ApplyFinance saveApplyFiance(@RequestBody ApplyFinance applyFinance) {
		return applyFinanceService.saveApplyFinance(applyFinance);
	}

	@PutMapping("/")
	public ApplyFinance updateApplyFinance(@RequestBody ApplyFinance applyFinance) {
		return applyFinanceService.updateApplyFinance(applyFinance);
	}
	
	@GetMapping("/getAll")
	public List<ApplyFinance> findAll(){
		return applyFinanceService.getAllApplyFinance();
	}
	
	@DeleteMapping("/{id}")
	public ApplyFinance delete(@PathVariable Long id) {
		return applyFinanceService.deleteApplyFinance(id);
	}
}
