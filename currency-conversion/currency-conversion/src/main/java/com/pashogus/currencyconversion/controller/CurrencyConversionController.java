package com.pashogus.currencyconversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pashogus.currencyconversion.dao.CurrencyConversion;
import com.pashogus.currencyconversion.proxy.CurrencyExchangeProxy;




@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping ("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getCalcualtedValue(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity
			)
	{
		CurrencyConversion retriveExchange = proxy.retriveExchange(from, to);
		
	return new CurrencyConversion(retriveExchange.getId(), from, to, retriveExchange.getExchangeValue(), retriveExchange.getEnvironment(), 
			retriveExchange.getExchangeValue().multiply(quantity),quantity);
	}

}
