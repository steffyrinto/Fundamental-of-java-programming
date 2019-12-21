package year;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int y=sc.nextInt();
		if(y%400==0||((y%4==0)&&(y%100!=0)))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	}

}
