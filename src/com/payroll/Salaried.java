package com.payroll;

public class Salaried extends Employee {
    public Salaried(int id) {
        super(id);
    }

    @Override
    public float calculatePay() {
        return 0;
    }
}
