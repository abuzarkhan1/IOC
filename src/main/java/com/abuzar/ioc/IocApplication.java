package com.abuzar.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
//        SpringApplication.run(IocApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Scanner scanner = new Scanner(System.in);
        System.out.println("choose car type you want to buy:-\n1. Family Car\n2. Sports Car\n3. Cybertruck Car");
        int userSelect = scanner.nextInt();
        String beanId = "";
        while (userSelect != 0) {
            switch (userSelect) {
                case 1:
                    beanId = "family";
                    break;
                case 2:
                    beanId = "sports";
                    break;
                case 3:
                    beanId = "cybertruck";
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    continue;
            }
            Car car = context.getBean(beanId, Car.class);
            car.showCarDetails();
            System.out.println("choose car type you want to buy:-\n1. Family Car\n2. Sports Car\n3. Cybertruck Car");
            userSelect = scanner.nextInt();
        }

    }

}
