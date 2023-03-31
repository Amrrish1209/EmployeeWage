package com.bridgelabz.employeewageproblem;

import java.util.ArrayList;
import java.util.List;

class CompanyEmpWage {
	private final String company;
	private final int wagePerHour;
	private final int totalWorkingDays;
	private final int maxWorkingHour;
	private int totalWage;
	private List<Integer> dailyWages;

	public CompanyEmpWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHour) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.totalWorkingDays = totalWorkingDays;
		this.maxWorkingHour = maxWorkingHour;
		this.totalWage = 0;
		this.dailyWages = new ArrayList<Integer>();
	}

	public String getCompany() {
		return company;
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

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public void addDailyWage(int dailyWage) {
		this.dailyWages.add(dailyWage);
	}

	public List<Integer> getDailyWages() {
		return dailyWages;
	}
}