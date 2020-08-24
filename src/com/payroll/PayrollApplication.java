package com.payroll;

public class PayrollApplication {
    public static void main(String[] args) {

        Hourly anotherGuy = new Hourly(34567);
        anotherGuy.setHourlyRate(20F);
        anotherGuy.setName("Walter Dimwiddy");
        anotherGuy.work(8, DayOfWeek.MONDAY);
        anotherGuy.work(8, DayOfWeek.TUESDAY);
        anotherGuy.work(8, DayOfWeek.WEDNESDAY);
        anotherGuy.work(8, DayOfWeek.THURSDAY);
        anotherGuy.work(8, DayOfWeek.FRIDAY);
        anotherGuy.work(5, DayOfWeek.SATURDAY);
   //     anotherGuy.work(5, 455);
        System.out.println(anotherGuy.toString() + anotherGuy.getHoursWorked());

        float amountToPay = anotherGuy.calculatePay();
        System.out.println(anotherGuy.toString() + amountToPay);

        Sales salesPerson = new Sales("Jane Smith", 12345, .08F);
        salesPerson.makeSale(new Sale(10500, "2012 Volvo s40"));
        System.out.println(salesPerson.getTotalSales());
        System.out.println(salesPerson.calculatePay());

        Employee emp = new Sales("Jane Smith", 12345, .08F);
        Employee[] emps = new Employee[3];
        emps[0] = anotherGuy;
        emps[1] = salesPerson;
        emps[2] = emp;

        System.out.println("Attempting to call calculate pay on everyone");
        for (Employee e: emps){
            System.out.print(e.toString() + " ");
            System.out.println(e.calculatePay());
        }
        System.out.println("printing the Employee array");
        System.out.println(emps);

        int[] intArray = {1, 3, 5};
        System.out.println("printing the int array");
        System.out.println(intArray);
    }

    public static void testLoops(){
        int[] array = {1, 2, 3, 5, 7, 11, 13};

        for (int a = 0; a<array.length; a++){
            System.out.println(array[a]);
        }

        for (int num: array){
            System.out.println(num);
        }
        int total = 0;
        int count = 0;
        while(true){
 //           System.out.println(array[count]);
            total += count;
            count++;  // count = count +1;
            if (total>150) {
                break;
            }
        }
        System.out.println("It took " + count + " iterations to reach 150");

        total = 0;
        count = 0;
        do{
            total += count;
            count++;
        } while (total<150);

    }
//        Hourly disGuy = new Hourly(12.5F, "Bill Smith", 12345);
//        Hourly datGuy = new Hourly(14F, "Anne Smith", 23456);
//        // call the getName( ) method on the object(instance) pointed at by disGuy, and then store
//        // the result in a String pointed at by name
//        String name = disGuy.getName();
//        disGuy.setName("Billy Mumy");
//        System.out.println(name);
//        name = disGuy.getName();
//        System.out.println(name);
//        name = datGuy.getName();
//        System.out.println(name);
//        disGuy = null;

//        Hourly anotherGuy = new Hourly(34567);
//        anotherGuy.setHourlyRate(15.50F);
//        anotherGuy.work(4, Hourly.MONDAY);
//        anotherGuy.work(6, Hourly.TUESDAY);
//        anotherGuy.work(5, 455);
//        System.out.println(anotherGuy.getHoursWorked());
//
//        float amountToPay = anotherGuy.calculatePay();
//        System.out.println(amountToPay);
    //       testLoops();


}
