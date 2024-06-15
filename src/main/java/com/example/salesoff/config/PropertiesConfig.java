package com.example.salesoff.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("discount")
@Getter
@Setter
public class PropertiesConfig {
    private String authors;
    private String categories;
    private int lowSalesOff;
    private int lowNoBooks; // the maximum limit of books that enter for the low discount and the minimum limit -1 for the medium
    private int mediumSalesOff; //the maximum limit of books that enter for the medium discount
    private int mediumNoBooks;
    private int highSalesOff; // the minimum limit of books that enter for the low discount
    private int highNoBooks;
    private String versionId;
}