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
	double distance1,distance2,d1,d2;
	double x1,y1,x2,y2,x3,y3,x4,y4;
	//int 
	double compare;
	/**
	 * @param args
	 */
	/*UC2
	 * As a fan of geometry, I want to check equality of two lines based on
	 *  the end points, So that I know when two lines are the equal. 
	 * - Using Java equals method to check equality of 2 Lengths is preferable.
	 */
	/*
	 * UC3
	 * As a fan of geometry, I want to compare two lines based on the end points, 
	 * So that I know one line is equal, greater or less than the other line. 
	 * - Using Java compareTo method to compare 2 Lengths is preferable.
	 */
	/*
	 * UC4
	 * Use Java Object Oriented Programming Concepts of Line and Point 
	 * as well as equals and compareTo methods. 
	 * - Using Java compareTo method to compare 2 Lengths is preferable
	 */
		 public void line()
		 {

	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		double x1 = sc.nextDouble();  
		System.out.println("Enter the value of y1: ");  
		double y1 = sc.nextDouble();  
		System.out.println("Enter the value of x2: ");  
		double x2 = sc.nextDouble(); 
		System.out.println("Enter the value of y2: ");  
		double y2 = sc.nextDouble();  
		System.out.println("(x1,y1)&(x2,y2) are coordinates to find the length of Line1");
		System.out.println(" ");
		
		System.out.println("Enter the value of x3: ");  
		double x3= sc.nextDouble();  
		System.out.println("Enter the value of y3: ");  
		double y3= sc.nextDouble();  
		System.out.println("Enter the value of x4: ");  
		double x4= sc.nextDouble(); 
		System.out.println("Enter the value of y4: ");  
		double y4= sc.nextDouble(); 
	    System.out.println(" ");
		System.out.println("(x3,y3)&(x4,y4) are coordinates to find the length of Line2");
		System.out.println(" ");
		d1 = (Double)Math.sqrt(((x2 - x1) * (x2 - x1) ) + ((y2 - y1) *(y2 - y1)));
		d2= (Double)Math.sqrt(((x4 - x3) * (x4 - x3) ) + ((y4 - y3) *(y4 - y3)));
		System.out.println("length of line is:"+d1+"and"+d2);
		 }
	/*	public void distance()
		 {
	    distance1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	//	d1 = (Double)Math.sqrt(((x2 - x1) * (x2 - x1) ) + ((y2 - y1) *(y2 - y1)));
	//	System.out.println(d1);
		d1= Double.valueOf(distance1);
		distance2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
	//	d2= (Double)Math.sqrt(((x4 - x3) * (x4 - x3) ) + ((y4 - y3) *(y4 - y3)));
		System.out.println("length of line is:"+d1+"and"+d2);
		d2= Double.valueOf(distance2);
		
		 }*/
		public void compareTo()
		{
			
		        if(d1 > d2)
		         {
		        	 
		        	 System.out.println("Line1 is greater than Line2");
		         }
		        else if(d1<d2)
		        {
		        
		       	 System.out.println("Line1 is less than Line2");
		        }
		        else
		        {
		       	 System.out.println("Line1 & Line2 are equal");
		        }
			}

        public static void main(String[] args) 
        {
    		// TODO Auto-generated method stub
        	LineComparision LC1= new LineComparision();
        	
        	LC1.line();
        	//LC1.distance();
        	LC1.compareTo();
        	
			
        }
		   	        
	}


