package com.payroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HourlyTest {
    private Hourly hourly;
    @Before
    public void Before() throws Exception {
        hourly = new Hourly(23.6F, "WORK", 11111);
        float overtimeTotal;
    }

    @Test
    public void workSingleDayPositive() {
        float expectedHours = 7;
        hourly.work(7, DayOfWeek.TUESDAY);
        float actualHours = hourly.getHoursWorked();
        assertEquals(expectedHours, actualHours, .001);
    }

    @Test
    public void calculatePaySingleDayPositive() {
        float expectedPay = 165.2f;
        hourly.work(7, DayOfWeek.TUESDAY);
        float actualPay = hourly.calculatePay();
        assertEquals(expectedPay, actualPay, .001);
    }



    @Test
    public void calculatePayMultipleDaysPositive() {
        float expectedPay = 944.0f;
        hourly.work(8, DayOfWeek.MONDAY);
        hourly.work(8, DayOfWeek.TUESDAY);
        hourly.work(8, DayOfWeek.WEDNESDAY);
        hourly.work(8, DayOfWeek.THURSDAY);
        hourly.work(8, DayOfWeek.FRIDAY);
        float actualPay = hourly.calculatePay();
        assertEquals(expectedPay, actualPay, .001);
    }

    @Test
    public void getHoursWorkedSingleDayPositive() {
        float expectedHours = 7;
        hourly.work(expectedHours, DayOfWeek.TUESDAY);
        float actualHours = hourly.getHoursWorked();
        assertEquals(expectedHours, actualHours, .001);
    }

    @Test
    public void getHoursWorkedMultipleDaysPositive() {
        float expectedHours = 40.0f;
        hourly.work(8, DayOfWeek.MONDAY);
        hourly.work(8, DayOfWeek.TUESDAY);
        hourly.work(8, DayOfWeek.WEDNESDAY);
        hourly.work(8, DayOfWeek.THURSDAY);
        hourly.work(8, DayOfWeek.FRIDAY);
        float actualHours = hourly.getHoursWorked();
        assertEquals(expectedHours, actualHours, .001);
    }

    @Test
    public void calculateOvertimePayOTOnlyPositive() {
        float expectedOTPay = 177f;
        hourly.work(9, DayOfWeek.MONDAY);
        hourly.work(9, DayOfWeek.TUESDAY);
        hourly.work(9, DayOfWeek.WEDNESDAY);
        hourly.work(9, DayOfWeek.THURSDAY);
        hourly.work(9, DayOfWeek.FRIDAY);
        float overtimePay = hourly.calculateOvertimePay();
        assertEquals(expectedOTPay, overtimePay, 001);
    }
    @Test
    public void calculateOvertimePayPositive() {
        float expectedOTPay = 1121f;
        hourly.work(9, DayOfWeek.MONDAY);
        hourly.work(9, DayOfWeek.TUESDAY);
        hourly.work(9, DayOfWeek.WEDNESDAY);
        hourly.work(9, DayOfWeek.THURSDAY);
        hourly.work(9, DayOfWeek.FRIDAY);
        float payWithOvertime = hourly.calculatePay();
        assertEquals(expectedOTPay, payWithOvertime, 001);
    }

}