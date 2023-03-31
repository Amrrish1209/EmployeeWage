package com.bridgelabz.employeewageproblem;

public class CompanyEmpWage {

	private final String company;
	private final int wagePerHour;
	private final int totalWorkingDays;
	private final int maxWorkingHour;
	private int totalWage;

	public CompanyEmpWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHour) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.totalWorkingDays = totalWorkingDays;
		this.maxWorkingHour = maxWorkingHour;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String getCompany() {
		return company;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}

	public int getMaxWorkingHour() {
		return maxWorkingHour;
	}
}
