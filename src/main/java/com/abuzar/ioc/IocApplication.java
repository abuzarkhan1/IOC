package com.abuzar.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
//        SpringApplication.run(IocApplication.class, args);

        // not to update or change code

        car c = new lambo();
        c.speed();
    }

}
