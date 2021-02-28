package EmailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int passwordLength = 8;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	// constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email created for: "+this.firstName+ " "+ this.lastName);
		//call method asking for department name
		this.department = setDepartment();
		System.out.println("Department is "+this.department);
		
		// call method for generating random password
		this.password = randomPassword(passwordLength);
		System.out.println("Your password length is :"+this.password);
		
		
	}
	

	// ask for department
	private String setDepartment() {
		System.out.print("\nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code:");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
				switch (deptChoice) {
				case 1:
					return "Sales";
				case 2:
					return "Development";
				case 3:
					return "Accounting";
				default:
					return "";
				}
		
				
	}
	
	// generate random password
	private String randomPassword(int length) { 
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@_%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}	
	
	
	// set the mail box capacity
	
	// set the alternate email
	
	// change the password
	
	

}
