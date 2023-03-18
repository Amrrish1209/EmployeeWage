package com.bridgelabz.employeewageproblem;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Checking Employee is present or absent if present then we want to calculate the daily wage");
		int fullday=1;
		double empcheck = Math.floor(Math.random()*10)%2;
		if (empcheck==fullday) {
			System.out.println("checking Employee working hour as 4 or 8 hour");
			int wageperhour=20;
			int fulldayhour=Math.floor(Math.random()*10)%2==0 ? 4 : 8;
			if(fulldayhour == 8) {
			int empwagesalary=wageperhour*fulldayhour;
			System.out.println("Daily Employee Wage is: "+empwagesalary);
			}
			else if(fulldayhour == 4) {
				int empwageparttimesalary=wageperhour*fulldayhour;
				System.out.println("Part time Employee Wage is: "+empwageparttimesalary);
			}
			}
		else {
			System.out.println("Employee is Absent");
		}

	}
}
