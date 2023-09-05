/*
 Write a program to accept a coordinate point in a XY coordinate system 
and determine in which quadrant the coordinate point lies.
Test Case: Input : x=0 y=5
Output : Y axis 
Input : x=5 y=5
Output : Ist Quadrant
 
 */

package neebal_gurukul_assignment2;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x coordinates");
		double x=sc.nextInt();
		System.out.println("enter the y coordinates");
		double y=sc.nextInt();
		
		if(x==0 && y!=0)
		{
			System.out.println("it is lies on y-axis");
		}
		else if(x!=0 && y==0)
		{
			System.out.println("it is lies on x-axis");
		}
		else if(x>0 && y>0)
		{
			System.out.println("it is in 1st quadrent");
		}
		else if(x<0 && y>0)
		{
			System.out.println("it is in 2nd quadrent");
		}
		else if(x<0 && y<0)
		{
			System.out.println("it is in 3rd quadrent");
		}
		else
		{
			System.out.println("the coordinates are on origin");
		}
	}

}
