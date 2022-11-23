package com.payroll;

import java.util.ArrayList;


public class Receipts{
        ArrayList<Sale> sales = new ArrayList<>();
        public void makeSale(Sale sale) {
            int count = 0;
            sales.add(sale);
        }

    public float getTotalSales() {
        float total = 0;
        for (Sale sale:sales){
            total += sale.getAmountOfSale();
        }
        return total;
    }
}
