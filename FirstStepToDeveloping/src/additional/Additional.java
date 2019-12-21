package additional;

import java.util.Scanner;

public class Additional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		boolean a=false;
		Scanner sc=new Scanner(System.in);
		do
			{
			System.out.println("Enter a number");
			int n=sc.nextInt();
			if(n<0)
			{
				a=true;
			}
			else
			{
				for(int i=0;i<=n;i++)
				{
					sum=sum+i;
					a=false;
				}
				System.out.println("The sum is "+sum);
			
			} }
		while(a);

	}

}
