package EmailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int passwordLength = 8;
	private String department;
	private int mailBoxCapacity = 400;
	private String alternateEmail;
	private String email;
	
	// constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
//		System.out.println("Email created for: "+this.firstName+ " "+ this.lastName);
		//call method asking for department name
		this.department = setDepartment();
//		System.out.println("Department is "+this.department);
		
		// call method for generating random password
		this.password = randomPassword(passwordLength);
		System.out.println("Your password length is :"+this.password);
		
		// combine element to generate email
		email = firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+"company.com";
//		System.out.println("The email address is: "+email);
		
	}
	

	// ask for department
	private String setDepartment() {
		System.out.print("Welcome "+this.firstName+". Please, select your department:"+"\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code:");
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
					return "None";
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
	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}
	
	// get mailBox Capacity
	public int getMailBoxCapacity() { return mailBoxCapacity; }
	
	// set the alternate email
		public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}	
	
	// get the alternate email
	public String getAlternateEmail() { return alternateEmail; }

	// change the password
	public void changedPassword(String changeP) {
		this.password = changeP;
	}
	// get password
	public String getPassword() { return password; }

	// show details
	public String showInfo() {
		return "\nDISPLAY NAME: "+this.firstName+ " "+this.lastName
				+"\nEMAIL ADDRESS: "+this.email
				+"\nMAILBOX CAPACITY: "
				+this.mailBoxCapacity
				+"mb";
	}

}
