package ITsupporterimplementation;

import ITsupporter.home.ITSupporter;
import java.util.Random;

public class ITsupporterimplementation implements ITsupporterDemo {

	@Override
	public String generateEmailID(String fname, String lname, String Dept) {
		// TODO Auto-generated method stub
		return fname + lname +"@"+Dept+"abc.com";
	}

	@Override
	public  String generatepassword() {
		// TODO Auto-generated method stub
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowcaps = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String specialchars = "!@#$%^&*()";
		
		String combined = caps +lowcaps+nums+specialchars;
		String mypass=" ";
		
		Random random = new Random();
		for(int i=0;i<=10;i++) {
			mypass = mypass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return mypass;
	}

	@Override
	public void ShowITsupporterDetails(ITSupporter e) {
		// TODO Auto-generated method stub
		System.out.println("please enter the firstname:"+e.getFirstName());
		System.out.println("please enter the lastname:"+e.getLastName());
		System.out.println("please enter the email:"+e.getEmail());
		System.out.println("please enter the password:"+e.getPassword());
	}

	@Override
	public String generatepassword1() {
		// TODO Auto-generated method stub
		return null;
	}

}
