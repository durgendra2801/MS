package com.durgendra.util;

import com.durgendra.entity.ApplyFinance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
	private ApplyFinance applyFinance;
	private InvoiceEntry invoiceEntry;

}
