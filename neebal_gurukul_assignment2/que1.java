package neebal_gurukul_assignment2;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the angle");
		double a=sc.nextInt();
		a=Math.toRadians(a);
		double sum=1,num=1,fact=1;
		for(int i=2;i<=18;i++)
		{
			fact=fact*i;
			if(i%2==0) 
			{
				num=-num*a*a;
				sum=sum+num/fact;
			}
		}
		System.out.println("Result "+sum);

	}

}
