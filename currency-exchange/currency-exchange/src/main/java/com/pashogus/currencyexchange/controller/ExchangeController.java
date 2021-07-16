/**
 * 
 */
package com.pashogus.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pashogus.currencyexchange.dao.CurrencyExchange;
import com.pashogus.currencyexchange.repository.ExchangeRepository;

/**
 * @author 540091
 *
 */

@RestController
public class ExchangeController {
	
	@Autowired
	private ExchangeRepository exchangeRepository;
	
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchange(
			@PathVariable String from,
			@PathVariable String to
			)
	{
		CurrencyExchange findbyfromandTo = exchangeRepository.findByFromAndTo(from, to);
		findbyfromandTo.setEnvironment(environment.getProperty("local.server.port"));
		return findbyfromandTo;
		
	}
	
}
