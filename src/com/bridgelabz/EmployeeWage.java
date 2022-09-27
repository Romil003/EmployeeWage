package com.bridgelabz;

public class EmployeeWage {
    static int EMP_WAGE_PER_HOUR = 20;
    static final int DAILY_TIME_HOUR = 8;
    public static void main(String[] args) {
        int employeeCheck = (int)Math.floor(Math.random()*10) %2;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if(employeeCheck == 1){
            System.out.println("Employee is present");
            dailyWage = EMP_WAGE_PER_HOUR*DAILY_TIME_HOUR;
            System.out.println("Daily wage is " + dailyWage);
        }
        else {
            System.out.println("Employee is absent");
            System.out.println("Daily wage is " + dailyWage);
        }
    }
}
