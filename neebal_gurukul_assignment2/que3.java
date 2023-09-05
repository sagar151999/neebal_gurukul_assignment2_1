package neebal_gurukul_assignment2;

import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lower bond");
		int lowerbond=sc.nextInt();
		System.out.println("enter the upper bond");
		int upperbond=sc.nextInt();
		int a=0,b=1;
		for(int i=a+b;i<=upperbond;i=a+b)
		{
			if(i>=lowerbond)
			{
				System.out.println(i+" ");
			}
			a=b;
			b=i;
			
		}
	}

}
