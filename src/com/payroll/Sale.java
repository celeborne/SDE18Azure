package com.payroll;

public class Sale{
    private float amountOfSale;
    private String description;
    public Sale(float amountOfSale, String description) {
        this.amountOfSale = amountOfSale;
        this.description = description;
    }

    public float getAmountOfSale() {
        return amountOfSale;
    }

    public void setAmountOfSale(float amountOfSale) {
        this.amountOfSale = amountOfSale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
