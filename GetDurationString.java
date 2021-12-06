package com.technoelevate.assignmentchallenges;

import java.util.Scanner;

public class GetDurationString {
	 private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	public String getDurationString(int minutes, int seconds) {
	        String string = "";
	        int secondsSum = minutes * 60 + seconds;
	        if (minutes >= 0 && seconds >= 0 && seconds < 60) {
	            string = ((int) (secondsSum / 3600) + "h " + ((secondsSum % 3600) / 60) + "m " + (secondsSum % 60) + "s");
	        } else {
	           return INVALID_VALUE_MESSAGE;
	        }
	        return string;
	    }
		 
		
		 

    
	   void getDurationString(int seconds) {
	        String string = "";
	        if (seconds >= 0) {
	            string = getDurationString(seconds/60, seconds % 60);
	        }
	      
	    }
	
	 public static void main(String[] args) {
		GetDurationString string = new GetDurationString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("if u wanna enter min and sec type :: Y");
		System.out.println("if u wanna enter sec type :: N");
		char y=scanner.next().charAt(0);
		if(y=='y'||y=='Y') {
			int minutes=scanner.nextInt();
			int seconds=scanner.nextInt();
			System.out.println(string.getDurationString(minutes, seconds));
		}else {
			int string1=scanner.nextInt();
			string.getDurationString(string1);
			
		}
		
		
	}
}
