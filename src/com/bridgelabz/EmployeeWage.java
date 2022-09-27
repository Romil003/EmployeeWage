package com.bridgelabz;

public class EmployeeWage {
    static final int EMP_WAGE_PER_HOUR = 20;
    static int FULL_TIME_HOUR = 8;
    static int PART_TIME_HOUR = 4;
    public static void main(String[] args) {
        int employeeCheck = (int)Math.floor(Math.random()*10) %3;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if(employeeCheck == 2){
            System.out.println("Employee is present");
            dailyWage = EMP_WAGE_PER_HOUR*FULL_TIME_HOUR;
            System.out.println("Daily wage is " + dailyWage);
        }
        else if (employeeCheck == 1) {
            System.out.println("Employee is present");
            dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Daily wage is " + dailyWage);
        }
        else {
            System.out.println("Employee is absent");
            System.out.println("Daily wage is " + dailyWage);
        }
    }
}
