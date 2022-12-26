/* Project 1 - Email Application
 * 
 * Scenario: You are an IT Support Administrator Specialist ans are charged with
 * the task of creating email accounts for new hires.
 * 
 * Your application should have the following:
 * 
 * - Generate an email with the following syntax: 
 * firstName.lastName@department.company.com
 * 
 * - Determine the department (sales, development, accounting), if none 
 * leave blank
 * 
 * - Generate a random String for a password
 * 
 * - Have set methods to change password, set mailbox capacity, and define
 * an alternate email address
 * 
 * - Have get methods to display the name, email, and mailbox capacity
 * 
 * */

import java.util.Random;
import java.util.Scanner;

public class MainApp {
	
	static Scanner sc = new Scanner(System.in);
	static Employee e1 = new Employee();

	public static void main(String[] args) {
		
		System.out.println("Creating new employee...");
		System.out.println();
		System.out.print("Enter first name: ");
		String firstName = sc.next().toLowerCase();
		System.out.print("Enter last name: ");
		String lastName = sc.next().toLowerCase();
		System.out.print("Enter department: ");
		String dept = sc.next().toLowerCase();
		
		e1.setFirstName(firstName);
		e1.setLastName(lastName);
		e1.setDept(dept);
		
		System.out.println();
		System.out.println("New employee Created.");
		
		int option;
		
		do {
			displayEmailAppMenu();
			System.out.println();
			System.out.print("Option: ");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1:
				createNewEmail();
				break;
			case 2:
				createNewPassword();
				break;
			case 3: 
				setNewPassword();
				break;
			case 4: 
				setNewMailboxCapacity();
				break;
			case 5:
				createAltEmail();
				break;
			case 6: 
				displayMailboxCapacity();
				break;
			case 7:
				displayAltEmail();
				break;
			case 8: 
				displayDept();
				break;
			case 0:
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println("No such option");
				break;
			}
			
		}while(option != 0);
	}
	
	static void displayDept() {
		System.out.println("Dept: " + e1.getDept());
		
	}

	static void displayAltEmail() {
		System.out.println("Alternate Email: " + e1.getAltEmail());
		
	}

	static void displayMailboxCapacity() {
		System.out.println("Mailbox Capacity: " + e1.getMailBoxCapacityInGB() + " GB");
		
	}

	static void createAltEmail() {
		System.out.print("Enter alternate email: ");
		String altEmail = sc.nextLine();
		e1.setAltEmail(altEmail);
		System.out.print("\nAlternate email updated.\n");
	}

	static void setNewMailboxCapacity() {
		System.out.print("Enter New Mailbox Capacity:  ");
		int newMailboxCapacity = sc.nextInt();
		sc.nextLine();
		e1.setMailBoxCapacityInGB(newMailboxCapacity);
		System.out.print("\nMailbox Capacity updated.\n");
		
	}

	static void setNewPassword() {
		System.out.print("New Password:  ");
		String newPw = sc.nextLine();
		e1.setPw(newPw);
		System.out.print("\nPassword updated.\n");
//		System.out.println(e1.getPw());
	}

	static void displayEmailAppMenu() {
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("- Email Application Menu -");
		System.out.println("-------------------------------");
		System.out.println("1 - Generate new email address");
		System.out.println("2 - Generate random password");
		System.out.println("3 - Set new password");
		System.out.println("4 - Set mailbox capacity");
		System.out.println("5 - Set an alternate email");
		System.out.println("6 - Display mailbox capacity");
		System.out.println("7 - Display an alternate email");
		System.out.println("8 - Display employee's department");
		System.out.println("0 - Exit");
		
	}
	
	static void createNewEmail() {
		System.out.println();
		System.out.println("Creating email...");
		String email = e1.getFirstName() + "." + e1.getLastName() + "@" + e1.getDept() + ".company.com";
		e1.setEmail(email);
		System.out.println("Email: " + e1.getEmail());
	}
	
	static void createNewPassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      
	      String pw = "";
	      for(char letter : password) {
	    	  pw += letter;
	      }
	      e1.setPw(pw);
	      System.out.println("Pw: " + e1.getPw());
	}
}
