package com.greatlearning.emailapp.driver;

import java.util.Scanner;

import com.greatlearning.emailapp.CredentialService.CredentialService;
import com.greatlearning.emailapp.Employee.Employee;

public class driver{
	public static void main(String[] args) {
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.print("\nPlease enter the department from the following: " + "\n" + "1.Technical\n2.Admin\n3.Human resource\n4.Legal" );
			int department = input.nextInt();
			String departmentName = new String();
			switch (department) {
			case 1:  
				departmentName = "technical";
				break;
			case 2:  
				departmentName = "admin";
				break;
			case 3:  
				departmentName = "humanresource";
				break;
			case 4:  
				departmentName = "legal";
				break;
			default:
				System.out.print("Invalid input. Please enter the correct input" );
				return;
			}
			System.out.print("Enter the first name:" );
			String firstName = input.next();
			System.out.print("Enter the last name:" );
			String lastName = input.next();
			
			Employee em=new Employee(firstName,lastName,departmentName);
			CredentialService cs = new CredentialService();
			cs.showCredentials(em);
				
		}
	}
	
}