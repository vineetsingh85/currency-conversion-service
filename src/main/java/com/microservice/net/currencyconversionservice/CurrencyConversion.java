package com.microservice.net.currencyconversionservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CurrencyConversion {
    private long id;
    private String from;
    private String to;
    private BigDecimal quanity;
    private BigDecimal totalCalculatedAmount;
    private BigDecimal conversionMultiple;
    private String environment;
}
