import java.util.Scanner;


public class UserInfo{
	static String Email="FA24-BCS-137@cuilahore.edu.pk";
	static String Password="Cui@lahore";

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Scanner sa=new Scanner(System.in);
	System.out.println("Please Enter Your Email: ");
	String email=sc.nextLine();
	System.out.println("Please Enter Your Password: ");
	String password=sa.nextLine();
	if(Email.equals(email) & Password.equals(password)){
	System.out.println("Verified Successfully");


	}
	else
	System.out.println("Wrong Credentials");
	
		

		}
 	



	}