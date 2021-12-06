package com.technoelevate.assignmentchallenges;

import java.util.Scanner;

public class CalculatingArea {
	
	
	public static  double area(double radius) {
		   if(radius < 0){
	            System.out.println("That's a negative value");
	            return -1.0;
	        }

	        System.out.println("Radius is " +radius );
	        return radius= radius * radius * Math.PI;
	    }
	
	public static double area(double x,double y) {
		if((x<0)||(y<0)) {
			System.out.println("That's a negative value");
			return -1.0;
		}
		System.out.println("area of rectangel :"+x*y);
		
		
		return x*y;
		
	}
	public static void main(String[] args) {
		
		area(10);
		area(10,20);
		
		
		
		
	}
	
	}






