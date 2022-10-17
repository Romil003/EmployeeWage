package com.bridgelabz;

public class EmployeeWage {
    private int EMP_WAGE_PER_HOUR ;
    private int FULL_TIME_HOUR ;
    private int PART_TIME_HOUR ;
    private int WORKING_DAYS_PER_MONTH ;

    private int TOTAL_EMPLOYEE_WAGE ;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;


    public EmployeeWage() {
    }

    public EmployeeWage(int EMP_WAGE_PER_HOUR, int FULL_TIME_HOUR, int PART_TIME_HOUR, int WORKING_DAYS_PER_MONTH) {
        this.EMP_WAGE_PER_HOUR = EMP_WAGE_PER_HOUR;
        this.FULL_TIME_HOUR = FULL_TIME_HOUR;
        this.PART_TIME_HOUR = PART_TIME_HOUR;
        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
    }

    public void calculateEmployeeWage() {

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
        TOTAL_EMPLOYEE_WAGE = totalWage;

    }

    @Override
    public String toString() {
        return "TOTAL_EMPLOYEE_WAGE=" + TOTAL_EMPLOYEE_WAGE ;
    }

    public static void main(String[] args) {
        EmployeeWage LT = new EmployeeWage(30,10,6,25);
        LT.calculateEmployeeWage();
        System.out.println("LT wage is : " + LT.toString());

        EmployeeWage Google = new EmployeeWage(20,11,7,23);
        Google.calculateEmployeeWage();
        System.out.println("Google wage is : " + Google.toString());

    }
}
