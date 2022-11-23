package com.payroll;

public class Hourly extends Employee {
    private TimeCard timeCard = new TimeCard();
    public static final float MIN_WAGE = 11.5F;
    public static final float OVERTIME = 40f;
    private float hourlyRate;
//    private String name;
    private float overtimeTotal;
    private float calcOvertimeTotal;
    private float total;
    // id is set once, never changed
//    private int id;

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

////    public int getId() {
//        return id;
//    }

    @Override
    public String toString() {
        return super.toString() + "Hourly{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }

    public Hourly(int id) {
        super(id);
//        this.id = id;
    }

    public Hourly(float hourlyRate, String name, int id) {
        this(id);
        this.hourlyRate = hourlyRate;
        setName(name);
    }
    public float getHoursWorked() {
        return timeCard.getHoursWorked();
    }

    public void work(float amountWorked, DayOfWeek day) {
        timeCard.work(amountWorked, day);
    }
    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public float calculateOvertimePay(){
        overtimeTotal = (timeCard.getHoursWorked() - OVERTIME);
        calcOvertimeTotal = overtimeTotal * (hourlyRate * 1.5f);
        return calcOvertimeTotal;
    }

    public float calculatePay(){
        if (timeCard.getHoursWorked() > OVERTIME) {
            calculateOvertimePay();
            total = calcOvertimeTotal + (hourlyRate * (timeCard.getHoursWorked() - overtimeTotal));
        } else {
            total = hourlyRate * timeCard.getHoursWorked();
        }
        return total;
    }

}
