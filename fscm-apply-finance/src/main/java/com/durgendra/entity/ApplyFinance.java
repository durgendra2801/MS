package com.durgendra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ApplyFinance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String trackingId;
	private String seller_name;
	private String buyer_name;
	private String invoice_number;
	private Long invoice_id;
	private String status;
	

}
