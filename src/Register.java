import java.util.*;
public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Register Form ");
		System.out.println("Enter Your Roll Number: ");
		int RollNo=sc.nextInt();
		System.out.println("Enter Your Name: ");
		String s=sc.next();
		System.out.println("Enter Your Email: ");
		String email=sc.next();
		System.out.println("Enter your Password: ");
		String pass=sc.next();
		if(RollNo !=0 && s!="" && email!="" && pass!="") {
			System.out.println("Registration Successfully..");
		}else {
			System.out.println("Registration Not Successfull. Please fill all the rows");
		}
	}

}
