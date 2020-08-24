package com.payroll;

public class TimeCard {
//    public final static int SUNDAY = 0;
//    public final static int MONDAY = 1;
//    public final static int TUESDAY = 2;
//    public final static int WEDNESDAY = 3;
//    public final static int THURSDAY = 4;
//    public final static int FRIDAY = 5;
//    public final static int SATURDAY = 6;
    private float[] timeCard = new float[7];
    //work
    //get total hours

    public float getHoursWorked() {
        float totalHoursWorked = 0;
        // hey, fix this thing - add up all the hours in the array and return it
        for (float daysOfWeek:timeCard) {
            totalHoursWorked += daysOfWeek;
        }
        return totalHoursWorked;
    }

    public void work(float amountWorked, DayOfWeek day){
        if (day.ordinal() >= 0 && day.ordinal() <= 6);
        timeCard[day.ordinal()] += amountWorked;
//        hoursWorked += amountWorked;
    }
}
