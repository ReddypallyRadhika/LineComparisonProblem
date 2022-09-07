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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length;
	    Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the value of x1: ");  
		double x1 = sc.nextDouble();  
		System.out.print("Enter the value of y1: ");  
		double y1 = sc.nextDouble();  
		System.out.print("Enter the value of x2: ");  
		double x2 = sc.nextDouble(); 
		System.out.print("Enter the value of y2: ");  
		double y2 = sc.nextDouble();
		length =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));	
		
        System.out.println("Length of Line ="+length);
	
	}

}
