package com.currency.conversion.factor.dao;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.currency.conversion.factor.model.ManageCurrencyFactor;
@Repository
public interface CurrenncyRepo extends JpaRepository<ManageCurrencyFactor, Integer>{
	
	ManageCurrencyFactor findById(int id);
	
	ManageCurrencyFactor findByFrom(String sr);
	
}
