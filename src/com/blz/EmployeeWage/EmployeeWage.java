package com.blz.EmployeeWage;
import java.util.Random;
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		int wagePerHour = 20;
		int fullDayHour = 8;
		int halfDayHour = 4;
		int salary = 0;
		int workingDayPerMonth = 20;
		int monthlySalary = 0;
		
		Random random = new Random();
		int randomNum = random.nextInt(3);
		
		for(int i=1; i<=workingDayPerMonth; i++)
		{		
		switch(randomNum) 
		{
		case 0: 
			System.out.println("Employee is Absent");
		    break;
		case 1: 
			System.out.println("Employee is Present");
		    salary= wagePerHour * fullDayHour;
		    break;
		case 2: salary= wagePerHour * halfDayHour;
		     break;
		}
	      monthlySalary = monthlySalary + salary;
		}
	
		   System.out.println("Employee monthlySalary is: "+monthlySalary);

	}

}
