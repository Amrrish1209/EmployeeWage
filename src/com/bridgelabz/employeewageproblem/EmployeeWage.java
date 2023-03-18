package com.bridgelabz.employeewageproblem;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Checking Employee is present or absent if present then we want to calculate the daily wage");
		int empcheck = Math.floor(Math.random() * 10) % 2 == 1 ? 1 : 0;
		int wageperhour = 20;
		switch (empcheck) {
		case 1:
			System.out.println("checking Employee working hour as 4 or 8 hour");
			int fulldayhour = Math.floor(Math.random() * 10) % 2 == 0 ? 4 : 8;
			if (fulldayhour == 8) {
				int empwagesalary = wageperhour * fulldayhour;
				System.out.println("Daily Employee Wage is: " + empwagesalary);
			} else if (fulldayhour == 4) {
				int empwageparttimesalary = wageperhour * fulldayhour;
				System.out.println("Part time Employee Wage is: " + empwageparttimesalary);
			}
			break;
		case 0:
			System.out.println("Employee is Absent");
			break;
		}

	}
}
