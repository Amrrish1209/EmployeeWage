package com.bridgelabz.employeewageproblem;

public class EmployeeWage {
	private static final int wagePerHour = 20;
    private static final int totalWorkingDays =20;
    private static final int maxWorkingHour =100;
    private static int totalWorkHour =0;

    

    public static int calculateWage() {
        int day = 1;
        while (day <= totalWorkingDays && totalWorkHour <= maxWorkingHour) {
            int empCheck = Math.floor(Math.random() * 10) % 2 == 1 ? 1 : 0;
            int dayHour = Math.floor(Math.random() * 10) % 2 == 0 ? 4 : 8;
            switch (empCheck) {
                case 1:
                    if (dayHour == 8) {
                        totalWorkHour += dayHour;
                    } else if (dayHour == 4) {
                        totalWorkHour += dayHour;
                    }
                    break;
                case 0:
                    break;
            }
            day++;
        }
        return totalWorkHour * wagePerHour;
    }
    public static void main(String[] args) {
    	
    	int totalSalary = EmployeeWage.calculateWage();
    	System.out.println("Total Salary of Employee is: " + totalSalary);

	}
}
