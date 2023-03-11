package com.appproperties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:myconfig1.properties"})

public class MyConfig2 {
    @Value(value = "${name.firstname}")
    private String firstName;

    @Value(value = "${name.url}")
    private String url;

    public void readProp() {
        System.out.println(firstName);
        System.out.println(url);
    }
}
