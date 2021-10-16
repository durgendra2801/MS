package com.durgendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.durgendra.entity.ApplyFinance;

@Repository
public interface ApplyFinanceRepo extends JpaRepository<ApplyFinance, Long>{

}
