package com.bridgelabz.employeewageproblem;

public class EmployeeWage {
	private final String company;
	private final int wagePerHour;
	private final int totalWorkingDays;
	private final int maxWorkingHour;
	private int totalWage;

	public EmployeeWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHour) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.totalWorkingDays = totalWorkingDays;
		this.maxWorkingHour = maxWorkingHour;
	}

	public void calculateWage() {
		int day = 1;
		int totalWorkHour = 0;
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
		totalWage = totalWorkHour * wagePerHour;
	}

	public void printTotalWage() {
		System.out.println("Total salary for " + company + ": $" + totalWage);
	}

	public static void main(String[] args) {
		EmployeeWage companyOne = new EmployeeWage("Company 1", 20, 20, 100);
		companyOne.calculateWage();
		companyOne.printTotalWage();

		EmployeeWage companyTwo = new EmployeeWage("Company 2", 25, 22, 120);
		companyTwo.calculateWage();
		companyTwo.printTotalWage();
	}
}