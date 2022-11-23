package com.payroll;

public abstract class Employee{

    //    private float[] timeCard = new float[7];
    private String name;
    // id is set once, never changed
    private int id;

    public Employee(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract float calculatePay();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
