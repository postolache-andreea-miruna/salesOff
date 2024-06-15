package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class SalesOff {
    private String authors;
    private String categories;
    private int lowSalesOff;
    private int mediumSalesOff;
    private int highSalesOff;
}
