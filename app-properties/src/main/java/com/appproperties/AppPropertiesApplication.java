package com.appproperties;

import com.appproperties.config.MyConfig1;
import com.appproperties.config.MyConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppPropertiesApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(AppPropertiesApplication.class, args);

        MyConfig1 myConfig1 = applicationContext.getBean(MyConfig1.class);
        myConfig1.readProp();

        System.out.println("--------------");
        MyConfig2 myConfig2 = applicationContext.getBean(MyConfig2.class);
        myConfig2.readProp();
    }

}
