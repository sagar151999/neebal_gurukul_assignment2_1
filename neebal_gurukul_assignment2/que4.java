/*
 *  Print first 10 even fibonacii numbers
 */
package neebal_gurukul_assignment2;

import java.util.Scanner;

public class que4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the series do you want");
		int n=sc.nextInt();
		int count=0;
		int firstterm=0;
		int secondterm=1;
		for(int i=1;count<n;i++)
		{
			
			int nextterm=firstterm+secondterm;
			if(nextterm%2==0)
			{
				
				System.out.print(nextterm +" ");
				count++;
			}
			firstterm=secondterm;
			secondterm=nextterm;
		}

	}

}
