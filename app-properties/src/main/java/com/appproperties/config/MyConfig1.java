package com.appproperties.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources(value = {@PropertySource(value = {"classpath:myconfig1.properties"}),
        @PropertySource(value = {"classpath:myconfig2.properties"})})

public class MyConfig1 {
    @Autowired
    private Environment environment;

    public void readProp() {
        String property1 = environment.getProperty("name.firstname");
        String property2 = environment.getProperty("name.url");
        System.out.println(property1 + "\t" + property2);

        String property3 = environment.getProperty("my.number");
    }
}
