package com.pashogus.currencyconversion.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pashogus.currencyconversion.dao.CurrencyConversion;

@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {

	
	/*
	 * @PathVariable("from") String from , it need to be like this, if it is like @PathVariable String from, 
	 * 	application is not stating up , giving error error not able to resolve bean currecny conversion controller 
	 * because of dependency proxy (currency Exchange Proxy) and filed of path Variable is empty at param 0
	 */

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retriveExchange(@PathVariable("from") String from,
			@PathVariable("to") String to);
	
}

