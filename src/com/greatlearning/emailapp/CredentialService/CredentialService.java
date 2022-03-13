package com.greatlearning.emailapp.CredentialService;
import java.util.Random;
import com.greatlearning.emailapp.Employee.Employee;

public class CredentialService {
	public String generatePassword(int length) {
		String[] passwordAllowedChar = new String[4];
	      passwordAllowedChar[0] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      passwordAllowedChar[1] = "abcdefghijklmnopqrstuvwxyz";
	      passwordAllowedChar[2] = "!@#$";
	      passwordAllowedChar[3] = "1234567890";
	      Random random = new Random();
	      char[] password = new char[length];
	      int index = 0;
	      for(int i = 0; i< length ; i++) {
	         if (index == 4){
	            index = 0;
	         }
	        password[i] = passwordAllowedChar[index].charAt(random.nextInt(passwordAllowedChar[index].length()));
	         index ++;
	      }
	      return new String(password);
		
	}
	
	public String generateEmailAddress(Employee E) {
		return E.getFirstName()+E.getLastName()+ "@" + E.getDepartment() + ".greatlearning.com";
				
	}
	
	public void showCredentials(Employee E) {
		System.out.println("\nDear " + E.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email  ---> "+ generateEmailAddress(E));
		System.out.println("Password ---> "+ generatePassword(8));
		
	}
}