import java.util.*;
import java.util.HashMap;
public class Registration {

	static HashMap<String,String> users=new HashMap<String,String>();
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int select=0;
		while(select!=3) {
			System.out.println("Select an option: ");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Quit");
			
			select=sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1:register(sc);
			break;
			case 2:login(sc);
			break;
			case 3: break;
			default: System.out.println("Invalid Seletion");
			}
		}
		sc.close();
	}
	static void register(Scanner sc) {
		System.out.println("Enter your name: ");
		String un=sc.nextLine();
		System.out.println("Enter Your Password: ");
		String pass=sc.nextLine();
		if(users.containsKey(un)) {
			System.out.println("User Already Exists..");
		}else {
			users.put(un, pass);
			System.out.println("Registration Successfull...");
		}
	}
	static void login(Scanner sc) {
		System.out.println("Enter Username: ");
		String un=sc.nextLine();
		System.out.println("Enter Your Password: ");
		String pass=sc.nextLine();
		if(!users.containsKey(un)) {
			System.out.println("Invalid User or Password");
		}else {
			if(users.get(un).equals(pass)) {
				System.out.println("Login Successfull..");
			}else {
				System.out.println("Invalid User or Password");
			}
		}
	}
}
