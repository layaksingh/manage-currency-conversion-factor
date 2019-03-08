package com.currency.conversion.factor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.currency.conversion.factor.dao.CurrenncyRepo;
import com.currency.conversion.factor.model.ConvertRequestBuilder;
import com.currency.conversion.factor.model.ConvertedCurrency;
import com.currency.conversion.factor.model.CurrencyStatusResponse;
import com.currency.conversion.factor.model.ManageCurrencyFactor;

//Define the Spring Boot Controller
@Controller
public class ManageCurrencyController {
	@Autowired
	CurrenncyRepo repo;
	/**
	 * 
	 * @param factor
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST,  value="/addCurreny")
	@ResponseBody
	CurrencyStatusResponse  addConversionFactor(@RequestBody ManageCurrencyFactor factor ){
		CurrencyStatusResponse response=new CurrencyStatusResponse();
		System.out.println("New Add Currency "+factor);
		try {
			repo.save(factor);
			
			response.setStatus("Passed");
			response.setMessage("New Currency Conversion Added Successfully");
		
	   }catch (DataAccessException  exception) {
		    response.setStatus("Failed");
			response.setMessage("New Currency Conversion Added Failed");
		}
		
		return response;
		
	}
	/**
	 * 
	 * @param factor
	 * @return
	 */
	
	@RequestMapping(method = RequestMethod.POST,  value="/updateCurreny")
	@ResponseBody
	CurrencyStatusResponse  updateConversionFactor(@RequestBody ManageCurrencyFactor factor ){
		CurrencyStatusResponse response=new CurrencyStatusResponse();
		
		try {
			repo.save(factor);
			
			response.setStatus("Passed");
			response.setMessage("Currency Conversion Updated Successfully");
		
	   }catch (DataAccessException  exception) {
		    response.setStatus("Failed");
			response.setMessage("Currency Conversion Update Failed");
		}
		
		return response;
		
	}
	
	@RequestMapping("/getConversionFactor/{countryCode}")
	public ResponseEntity<Response> getConversionFactor(@PathVariable(name = "countryCode") String countryCode) {
		Response rsp = new Response();
		ManageCurrencyFactor factor=null;
		factor=repo.findByFrom(countryCode);
		if(factor!=null && factor.getFrom()!=null) {
			rsp.setError("");
			rsp.setMessage("SUCCESS...");
			rsp.setStatus(200);
			rsp.setFactorValue(factor.getFactor());
		}else {
			rsp.setError("No Record Found for country code : "+countryCode);
			rsp.setMessage("FAILED  No Currency found in system");
			rsp.setStatus(400);
			rsp.setFactorValue(null);
		}
		return ResponseEntity.ok().body(rsp);
	}
	
	
	/*
	*//**
	 * 
	 * @param currency
	 * @return
	 *//*
	@RequestMapping(method = RequestMethod.POST,  value="/getCurrenyFactor")
	@ResponseBody
	ManageCurrencyFactor  getConversionFactor(@RequestBody String currencyCode ){
		ManageCurrencyFactor factor=null;
		try {
			factor=repo.findBycurrency(currencyCode);
			System.out.println("Conversion Factor:: "+factor.getFactor());
			
					
	   }catch (Exception  e) {
		   
		   e.printStackTrace();
		}
		
		return factor;
		
	}*/
	
	
	
	/*@RequestMapping(method = RequestMethod.POST,  value="/convertCurrency")
	@ResponseBody
	public ConvertedCurrency convertCurrency(@RequestBody ConvertRequestBuilder request){
		System.out.println("currencycode "+request.getCurrency());
		ConvertedCurrency convertedCurrency=new ConvertedCurrency();
		try {
		ManageCurrencyFactor factor =repo.findById(request.getId());
		System.out.println("factor "+factor);
		if(factor!=null ){
		double total=factor.getFactor()*request.getAmount();
		convertedCurrency.setConvertedAmount(total);
	
		}
				
			
		} catch (Exception e) {
		
		e.printStackTrace();
		
		}
		
		return convertedCurrency;
	}*/
	

	/*@RequestMapping("/")
	@ResponseBody
	public String showcurrencyPage(@RequestParam(name="name")String currency){
		return currency;
	}*/
	
}
