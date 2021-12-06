package com.technoelevate.assignmentchallenges;

public class PrintFactors {
	public static void printFactors(int number) {
		if(number<1) {
			System.out.println("Invalid Number");
		}
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
			System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		printFactors(32);
	}

}
