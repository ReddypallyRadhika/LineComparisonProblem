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
	/*
	 * UC1
	 * As a fan of geometry, I want to model a line based on a point consisting of (x, y) co         
	 * -ordinates using he Cartesian system, So that I can calculate its length
.    *-A Length as 2 Points (x1, y1) and (x2, y2) 
     *- Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2
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
