package com.bridgelabz.employeewageproblem;

public class EmployeeWage {

	public static void main(String[] args) {
		
		int fullday=1;
		double empcheck = Math.floor(Math.random()*10)%2;
		if (empcheck==fullday) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	
	}
}
