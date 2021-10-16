package com.durgendra.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class InvoiceEntry implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String invoice_number;
	private String seller_name;
	private String buyer_name;
	private Double amount;
	private Date invoice_date;
	private Date invoice_exp_date;
	
}
