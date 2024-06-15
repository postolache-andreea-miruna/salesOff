package com.example.salesoff.controllers;

import com.example.salesoff.config.PropertiesConfig;
import com.example.salesoff.model.SalesOff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesOffController {
    @Autowired
    private PropertiesConfig propConfig;

    @GetMapping("/salesOff")
    public SalesOff getSalesOff(){
        return new SalesOff(propConfig.getAuthors(), propConfig.getCategories(),
                propConfig.getLowSalesOff(),
                propConfig.getLowNoBooks(),
                propConfig.getMediumSalesOff(),
                propConfig.getMediumNoBooks(),
                propConfig.getHighSalesOff(),
                propConfig.getHighNoBooks(),
                propConfig.getVersionId());
    }
}
