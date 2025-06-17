package oops;
import java.util.Date;
import java.util.Scanner;
public class OOPSCLASS {
		public static void main(String[] args) {
		
//		AbstractInterface ai = new AbstractInterface() {
//			public void buyDress() {
//				
//			}
//		}
			EncapsulationClass user = new EncapsulationClass();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name:");
			user.setEmail(sc.next().toLowerCase());
			System.out.println("Enter your DOB (Eg.YYYY/MM/DD");
			Date dob = new Date(sc.next());
			user.setAge(dob);
			System.out.println("Enter your Gender:");
			user.setGender(sc.next().charAt(0));
			System.out.println(user.getEmail());
		}}
