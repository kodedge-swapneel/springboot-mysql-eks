package com.example.springbootmysqleks.controller;

import com.example.springbootmysqleks.model.ExchangeRate;
import com.example.springbootmysqleks.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExchangeRateController {

    @Autowired
    ExchangeRateService exchangeRateService;

    @GetMapping("/getAmount")
    public double getAmount(@RequestParam String sourceCurrency, @RequestParam String targetCurrency) {
        return exchangeRateService.getAmount(sourceCurrency, targetCurrency);
    }

    @PostMapping("/addExchangeRate")
    public ExchangeRate addExchangeRate(@RequestBody ExchangeRate exchangeRate) {
        return exchangeRateService.addExchangeRate(exchangeRate);
    }

    @GetMapping("/")
    public String getHealth() {
        return "up";
    }

}
