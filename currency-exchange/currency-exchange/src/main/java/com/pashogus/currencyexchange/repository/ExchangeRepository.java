package com.pashogus.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pashogus.currencyexchange.dao.CurrencyExchange;



public interface ExchangeRepository extends JpaRepository<CurrencyExchange, Integer> {

	//if this is not like findByFromAndTo , then application will not start up
	//findBy  this syntax should be same
	//FromAndTo this should be From not from , if it is from , jpa could not able to find the property in object class
	//FromAndTo this should be To not to , if it is to , jpa could not able to find the property in object class
	CurrencyExchange findByFromAndTo(String from,String to);
}
