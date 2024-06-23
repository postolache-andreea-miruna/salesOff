package com.example.salesoff.controllers;

import com.example.salesoff.config.PropertiesConfig;
import com.example.salesoff.model.SalesOff;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SalesOffController {
    @Autowired
    private PropertiesConfig propConfig;

//    @GetMapping("/salesOff")
//    public SalesOff getSalesOff(){
//        return new SalesOff(propConfig.getAuthors(), propConfig.getCategories(),
//                propConfig.getLowSalesOff(),
//                propConfig.getLowNoBooks(),
//                propConfig.getMediumSalesOff(),
//                propConfig.getMediumNoBooks(),
//                propConfig.getHighSalesOff(),
//                propConfig.getHighNoBooks(),
//                propConfig.getVersionId());
//    }

    //zipkin
@GetMapping("/salesOff")
public ResponseEntity<SalesOff> getSalesOff(@RequestHeader("awbd-id")
                            String correlationId){
    SalesOff salesOff= new SalesOff(propConfig.getAuthors(), propConfig.getCategories(),
            propConfig.getLowSalesOff(),
            propConfig.getLowNoBooks(),
            propConfig.getMediumSalesOff(),
            propConfig.getMediumNoBooks(),
            propConfig.getHighSalesOff(),
            propConfig.getHighNoBooks(),
            propConfig.getVersionId());
    log.info("correlation-id discount: {}", correlationId);
    return ResponseEntity.status(HttpStatus.OK).body(salesOff);
}
}
