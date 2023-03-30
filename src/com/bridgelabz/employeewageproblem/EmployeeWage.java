package com.bridgelabz.employeewageproblem;

public class EmployeeWage {

    public static int calculateWage(int wagePerHour, int totalWorkingDays , int maxWorkingHour ) {
        int day = 1;
        int totalWorkHour=0;
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
    	
    	int companyOneSalary = EmployeeWage.calculateWage(20,20,100);
    	System.out.println("Total salary for Company 1: $" + companyOneSalary);
    	
    	int companySecondSalary = EmployeeWage.calculateWage(20,20,100);
    	System.out.println("Total salary for Company 2: $"+companySecondSalary);

	}
}
