package com.bridgelabz;

class EmpWageBuilder implements EmpWageInterface {

    private int EMP_WAGE_PER_HOUR ;
    private int FULL_TIME_HOUR ;
    private int PART_TIME_HOUR ;
    private int WORKING_DAYS_PER_MONTH ;

    private int TOTAL_EMPLOYEE_WAGE ;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    public EmpWageBuilder() {
    }

    public EmpWageBuilder(int EMP_WAGE_PER_HOUR, int FULL_TIME_HOUR, int PART_TIME_HOUR, int WORKING_DAYS_PER_MONTH){
        this.EMP_WAGE_PER_HOUR = EMP_WAGE_PER_HOUR;
        this.FULL_TIME_HOUR = FULL_TIME_HOUR;
        this.PART_TIME_HOUR = PART_TIME_HOUR;
        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;

    }

    public int calculateEmployeeWage() {

        int empHours = 0 ;
        int day = 1;
        int totalWage = 0;
        while (day < WORKING_DAYS_PER_MONTH && empHours <= 100) {
            int dailyWage = 0;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    dailyWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empHours += FULL_TIME_HOUR ;

                    break;
                case IS_PART_TIME:
                    dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                    empHours += PART_TIME_HOUR ;

                    break;
                default:
            }
            day++;
            totalWage += dailyWage ;

        }
        return totalWage;

    }

    public static void main(String[] args) {
        EmpWageBuilder company1 = new EmpWageBuilder(30,10,6,25);
        EmpWageBuilder company2 = new EmpWageBuilder(20,11,7,23);
        EmpWageBuilder company3 = new EmpWageBuilder(25,12,8,28);
        EmpWageBuilder company4 = new EmpWageBuilder(60,14,10,30);

        int[] companyEmpWage = new int[4];
        companyEmpWage[0] = company1.calculateEmployeeWage();
        companyEmpWage[1] = company2.calculateEmployeeWage();
        companyEmpWage[2] = company3.calculateEmployeeWage();
        companyEmpWage[3] = company4.calculateEmployeeWage();

        System.out.print("{ ");
        for (int i=0; i<companyEmpWage.length;i++){
            System.out.print(companyEmpWage[i] + " ");
        }
        System.out.print("}");


    }
}


