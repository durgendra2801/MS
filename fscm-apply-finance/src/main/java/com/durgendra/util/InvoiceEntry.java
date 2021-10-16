package com.durgendra.util;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class InvoiceEntry implements Serializable{
	
	private Long id;
	private String invoice_number;
	private String seller_name;
	private String buyer_name;
	private Double amount;
	private Date invoice_date;
	private Date invoice_exp_date;
	
}
