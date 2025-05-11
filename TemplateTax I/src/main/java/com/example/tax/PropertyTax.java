package com.example.tax;

public class PropertyTax implements Tax {
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */

    private double taxableAmount;
    private double taxAmount;
    private boolean isTaxPayed;


    @Override
    public void setTaxableAmount(int amount) {
        this.taxableAmount = amount;
    }

    @Override
    public void calculateTaxAmount() {
        taxAmount = taxableAmount * 0.05;
    }

    @Override
    public double getTaxAmount() {
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "property";
    }

    @Override
    public boolean isTaxPayed() {
        return isTaxPayed;
    }

    @Override
    public void payTax() {
        System.out.println("Hi, your property tax is paid.");
        isTaxPayed = true;
    }
}
