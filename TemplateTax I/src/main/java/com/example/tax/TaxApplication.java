package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {
		// Take ClassPathXmlApplicationContext from applicationContext.xml file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get the bean from the context and calculate it income tax and property tax
		// use while loop or if else it defend on the user input what to select income tax or property tax
		// and then calculate the tax amount and pay the tax
		// Get the bean from the context and calculate it income tax and property tax
		Tax tax = context.getBean("incomeTax", Tax.class);
		tax.setTaxableAmount(500000);
		tax.calculateTaxAmount();
		System.out.println("Tax Amount: " + tax.getTaxAmount());
		System.out.println("Tax Type: " + tax.getTaxType());
		System.out.println("Is Tax Payed: " + tax.isTaxPayed());
		tax.payTax();
		System.out.println("Is Tax Payed: " + tax.isTaxPayed());
		tax = context.getBean("propertyTax", Tax.class);
		tax.setTaxableAmount(1000000);
		tax.calculateTaxAmount();
		System.out.println("Tax Amount: " + tax.getTaxAmount());
		System.out.println("Tax Type: " + tax.getTaxType());
		System.out.println("Is Tax Payed: " + tax.isTaxPayed());
		tax.payTax();
		System.out.println("Is Tax Payed: " + tax.isTaxPayed());
		context.close();
	}

}
