import java.util.*;
public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int RollNo;
		System.out.println("Register Form ");
		System.out.println("Enter Your Roll Number: ");
		RollNo=sc.nextInt();
		System.out.println("Enter Your Name: ");
		String s=sc.next();
		System.out.println("Enter your Password: ");
		String pass=sc.next();
		System.out.println("Roll No: "+RollNo+" Name: "+s+" Password: "+pass);
	}

}
