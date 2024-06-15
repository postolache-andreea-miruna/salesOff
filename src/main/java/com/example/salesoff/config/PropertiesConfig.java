package config;

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
    private int mediumSalesOff;
    private int highSalesOff;
}