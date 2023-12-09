package ITsupporter.Driver;
import java.util.Scanner;

import ITsupporter.home.ITSupporter;
import ITsupporterimplementation.ITsupporterimplementation;

public class ITDriver {
	public static void main(String[] args) {
		ITsupporterimplementation ITSupporter = new ITsupporterimplementation(); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name:");
		String firstName =sc.next();
		System.out.println("enter the last name:");
		String lastName = sc.next();
		
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");
		
		System.out.println("please select the Departments");
		int option = sc.nextInt();
		String genEmail=" ";
		String genpassword=" ";
		switch(option) {
		case 1:
			genEmail =ITSupporter.generateEmailID(firstName, lastName, "Tech");
			break;
		case 2:
			genEmail = ITSupporter.generateEmailID(firstName, lastName, "Admin");
			break;
			
		case 3:
			genEmail = ITSupporter.generateEmailID(firstName, lastName, "HR");
			break;
			
		case 4:
			genEmail = ITSupporter.generateEmailID(firstName, lastName, "Legal");
			break;
			default:
				System.out.println("Please enter the valid Department option");
		}
		System.out.println(genEmail);
		
		genpassword =ITSupporter.generatepassword();
		ITSupporter karthik = new ITSupporter();
		karthik.setFirstName(firstName);
		karthik.setLastName(lastName);
		karthik.setEmail(genEmail);
		karthik.setPassword(genpassword);
		ITSupporter.ShowITsupporterDetails(karthik);
		sc.close();
	}

}
