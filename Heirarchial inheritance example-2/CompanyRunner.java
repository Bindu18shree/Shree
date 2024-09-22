package com.xworkz.company.runner;

import com.xworkz.company.boot.EmployeeI;
import com.xworkz.company.boot.EmployeeII;

public class CompanyRunner {
	
	public static void main(String [] args) {
		
		EmployeeI employeeI = new EmployeeI();
		
		EmployeeII employeeII = new EmployeeII();
		
		System.out.println("Name of the company :" +employeeI.getCompanyName());
		System.out.println("Address of the company :" +employeeI.getCompanyAddress());
		System.out.println("Pincode of the company :" +employeeII.getCompanyPincode());
		System.out.println("Company is opened :" +employeeII.isCompanyOpenedOrClosed());
		System.out.println("Company opens at(AM) :" +employeeII.getOpensAt());
		System.out.println("Name of the the employee 1 :" +employeeI.getNameofTheEmployee());
		System.out.println("Age of the Employee 1 :" +employeeI.getAge());
		System.out.println("Contact number of the employee 1:" +employeeI.getContactNumber());
		System.out.println("Name of the employee 2 :" +employeeII.getNameofTheEmployee());
		System.out.println("Age of the employee 2 :" +employeeII.getAge());
		System.out.println("Contact Number of the employee 2 :" +employeeII.getContactNumber());
		
		
	}

}
