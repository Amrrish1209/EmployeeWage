package com.bridgelabz.employeewageproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHour);

	public void calculateTotalWage();

	public void printTotalWage();

	public int getTotalWageByCompany(String company);
}

public class EmpWageBuilder implements IComputeEmpWage {
	private final List<CompanyEmpWage> companyEmpWages;
	private int numOfCompanies;
	private final Map<String, Integer> companyWageMap;

	public EmpWageBuilder() {
		companyEmpWages = new ArrayList<>();
		numOfCompanies = 0;
		companyWageMap = new HashMap<>();
	}

	@Override
	public void addCompanyEmpWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHour) {
		companyEmpWages.add(new CompanyEmpWage(company, wagePerHour, totalWorkingDays, maxWorkingHour));
		numOfCompanies++;
	}

	@Override
	public void calculateTotalWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			int day = 1;
			int totalWorkHour = 0;
			while (day <= companyEmpWages.get(i).getTotalWorkingDays()
					&& totalWorkHour <= companyEmpWages.get(i).getMaxWorkingHour()) {
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
				int dailyWage = dayHour * companyEmpWages.get(i).getWagePerHour();
				companyEmpWages.get(i).addDailyWage(dailyWage);
				day++;
			}
			int totalWage = totalWorkHour * companyEmpWages.get(i).getWagePerHour();
			companyEmpWages.get(i).setTotalWage(totalWage);
			companyWageMap.put(companyEmpWages.get(i).getCompany(), totalWage);
		}
	}

	@Override
	public void printTotalWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			System.out.println("Total salary for " + companyEmpWages.get(i).getCompany() + ": $"
					+ companyEmpWages.get(i).getTotalWage());
		}
	}

	@Override
	public int getTotalWageByCompany(String company) {
		if (companyWageMap.containsKey(company)) {
			return companyWageMap.get(company);
		} else {
			System.out.println("No data found for " + company);
			return -1;
		}
	}

	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Company 1", 20, 20, 100);
		empWageBuilder.addCompanyEmpWage("Company 2", 25, 22, 120);
		empWageBuilder.calculateTotalWage();
		empWageBuilder.printTotalWage();

		String company1 = "Company 1";
		String company2 = "Company 2";
		System.out.println("Total wage for " + company1 + ": $" + empWageBuilder.getTotalWageByCompany(company1));
		System.out.println("Total wage for " + company2 + ": $" + empWageBuilder.getTotalWageByCompany(company2));
	}
}