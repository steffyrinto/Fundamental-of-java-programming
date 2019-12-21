package resume;

import java.util.Scanner;

public class Resume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=a.next();
		System.out.println("Enter your age");
		int age=a.nextInt();
		System.out.println("Enter your Degree");
		String Degree=a.next();
		System.out.println("Enter your Branch");
		String branch=a.next();
		System.out.println("Enter your Contact Number");
		String contactnum=a.next();
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Degree : "+Degree);
		System.out.println("Branch : "+branch);
		System.out.println("Contact: "+contactnum);

	}

}
