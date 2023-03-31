package com.bridgelabz.employeewageproblem;

interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHour);

	public void calculateTotalWage();

	public void printTotalWage();
}

public class EmpWageBuilder implements IComputeEmpWage {
	private final CompanyEmpWage[] companyEmpWages;
	private int numOfCompanies;

	public EmpWageBuilder() {
		companyEmpWages = new CompanyEmpWage[5];
		numOfCompanies = 0;
	}

	@Override
	public void addCompanyEmpWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHour) {
		companyEmpWages[numOfCompanies] = new CompanyEmpWage(company, wagePerHour, totalWorkingDays, maxWorkingHour);
		numOfCompanies++;
	}

	@Override
	public void calculateTotalWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			int day = 1;
			int totalWorkHour = 0;
			while (day <= companyEmpWages[i].getTotalWorkingDays()
					&& totalWorkHour <= companyEmpWages[i].getMaxWorkingHour()) {
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
			int totalWage = totalWorkHour * companyEmpWages[i].getWagePerHour();
			companyEmpWages[i].setTotalWage(totalWage);
		}
	}

	@Override
	public void printTotalWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			System.out.println(
					"Total salary for " + companyEmpWages[i].getCompany() + ": $" + companyEmpWages[i].getTotalWage());
		}
	}

	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Company 1", 20, 20, 100);
		empWageBuilder.addCompanyEmpWage("Company 2", 25, 22, 120);
		empWageBuilder.calculateTotalWage();
		empWageBuilder.printTotalWage();
	}
}