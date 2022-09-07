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
		int workingHourPerMonth = 0;
		int days = 1;
		
		Random random = new Random();
		
		while(days!=20 && workingHourPerMonth!=100)
		{
			int randomNum = random.nextInt(3);
		switch(randomNum) 
		{
		case 0: 
			System.out.println("Employee is Absent");
		    break;
		case 1: 
			System.out.println("Employee is Present");
		    salary= wagePerHour * fullDayHour;
		    workingHourPerMonth = workingHourPerMonth + fullDayHour;
		    break;
		case 2: salary= wagePerHour * halfDayHour;
		     workingHourPerMonth = workingHourPerMonth + halfDayHour;
		     break;
		}
		monthlySalary = monthlySalary + salary;
		System.out.println("Day "+days+ ":"+salary);
		days++;
	      
		}
	
		   System.out.println("Employee monthlySalary is: "+monthlySalary);

	}

}
