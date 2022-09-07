/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class LineComparision {

	/**
	 * @param args
	 */
	/*UC2
	 * As a fan of geometry, I want to check equality of two lines based on
	 *  the end points, So that I know when two lines are the equal. 
	 * - Using Java equals method to check equality of 2 Lengths is preferable.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length1,length2;
	    Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of x1:");  
		double x1 = sc.nextDouble();  
		System.out.println("Enter the value of y1: ");  
		double y1 = sc.nextDouble();  
		System.out.println("Enter the value of x2: ");  
		double x2 = sc.nextDouble(); 
		System.out.println("Enter the value of y2: ");  
		double y2 = sc.nextDouble();  
		length1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("(x1,y1)&(x2,y2) are coordinates to find the length of Line1");
		System.out.println(" ");
		System.out.println("Enter the value of x3: ");  
		double x3= sc.nextDouble();  
		System.out.print("Enter the value of y3: ");  
		double y3= sc.nextDouble();  
		System.out.println("Enter the value of x4: ");  
		double x4= sc.nextDouble(); 
		System.out.println("Enter the value of y4: ");  
		double y4= sc.nextDouble();
		length2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.println("(x3,y3)&(x4,y4) are coordinates to find the length of Line2");
		System.out.println(" ");
       System.out.println("Length of Line1 ="+length1);
       System.out.println("Length of Line2 ="+length2);
        Double l1= Double.valueOf(length1);
        Double l2= Double.valueOf(length2);
        System.out.println(" ");
         if(l1.equals(l2))
         {
        	 System.out.println("Line1 & Line2 are equal");
         }
         else
         {
        	 System.out.println("Line1 & Line2 are not equal");
         }
         
	}

}
