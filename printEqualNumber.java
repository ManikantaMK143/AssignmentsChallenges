package com.technoelevate.assignmentchallenges;

public class printEqualNumber {
	public static void printEqualNumber(int a,int b,int c) {
		if((a<0)||(b<0)||(c<0)) {
			System.out.println("Invalid Value");
		}else if((a==b)&&(a==c)) {
			System.out.println("All number are equal");
		}else if((a==b)&&(a!=c)) {
			System.out.println("Neither all are equal are differnt");
		}else {
			System.out.println("all number are different");
		}
		
		
	}
	public static void main(String[] args) {
		printEqualNumber(1,1,1);
		printEqualNumber(1,2,3);
		printEqualNumber(-1,-2,-3);
		printEqualNumber(1,1,3);
		
	}

}
