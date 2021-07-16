/**
 * 
 */
package com.pashogus.currencyexchange.dao;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 540091
 *
 */
@Entity
public class CurrencyExchange {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="from_value")
	private String from;
	
	@Column(name="to_value")
	private String to;
	
	private BigDecimal exchangeValue;
	
	private String environment;
	
	
	
	
	
	
	public CurrencyExchange() {
		super();
	}
	public CurrencyExchange(Long id, String from, String to, BigDecimal exchangeValue, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
		this.environment = environment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public BigDecimal getExchangeValue() {
		return exchangeValue;
	}
	public void setExchangeValue(BigDecimal exchangeValue) {
		this.exchangeValue = exchangeValue;
	}
	
	
}
