package com.bridgelabz.employeewageproblem;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Checking Employee is present or absent if present then we want to calculate the daily wage");
		int wageperhour = 20;
		int totalworkingdays = 20;
		int totalworkhour = 0;
		int maxworkinghour=100;
		int day=1;

		while(day<=totalworkingdays && totalworkhour<=maxworkinghour) {
			int empcheck = Math.floor(Math.random() * 10) % 2 == 1 ? 1 : 0;
			int dayhour = Math.floor(Math.random() * 10) % 2 == 0 ? 4 : 8;
			switch (empcheck) {
			case 1:
				System.out.println("checking Employee working hour as 4 or 8 hour");
				if (dayhour == 8) {
					int empwagesalary = wageperhour * dayhour;
					System.out.println("Daily Employee Wage is: " + empwagesalary);
				} else if (dayhour == 4) {
					int empwageparttimesalary = wageperhour * dayhour;
					System.out.println("Part time Employee Wage is: " + empwageparttimesalary);
				}
				totalworkhour = totalworkhour + dayhour;
				break;
			case 0:
				System.out.println("Employee is Absent and salary is 0");
				break;
			}
			day++;
		}
		int totalsalary = totalworkhour * wageperhour;
		System.out.println("Total Salary of Employee is: " + totalsalary);
	}
}
