package com.example.cloudserver.confis;

import java.util.HashSet;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Liq
 * @date 2019/8/29
 */
@Data
@Component
@Configuration
@PropertySource("classpath:hotel.properties")
@ConfigurationProperties("hotel")
public class HotelProperties {

    private HashSet<String> ids;

}
