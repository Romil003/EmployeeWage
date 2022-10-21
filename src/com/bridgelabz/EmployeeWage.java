package com.bridgelabz;

public class EmployeeWage {
    static final int EMP_WAGE_PER_HOUR = 20;
    static int FULL_TIME_HOUR = 8;
    static int PART_TIME_HOUR = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    public static void calculateEmpWage(){
        int empHours = 0 ;
        int day = 1;
        int totalWage = 0;
        while (day < WORKING_DAYS_PER_MONTH && empHours <= 100) {
            int dailyWage = 0;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeCheck);
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is present");
                    dailyWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empHours += FULL_TIME_HOUR ;

                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is present");
                    dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                    empHours += PART_TIME_HOUR ;

                    break;
                default:
                    System.out.println("Employee is absent");
            }
            day++;
            totalWage += dailyWage ;
            System.out.println("Total employee hours are " + empHours);
            System.out.println("Total wage for " + day + " day is " + totalWage);
        }
    }

    public static void main(String[] args) {

        calculateEmpWage();
    }
}
