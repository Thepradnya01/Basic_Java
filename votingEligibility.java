package Basics;


import java.util.*;


public class votingEligibility {
	
	public static void voteEligibility( int age) {
		if(age>=18)
			System.out.println("You are eligible to vote");
		
		else
			System.out.print("Not Eligible");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		
		int age=sc.nextInt();
		
		voteEligibility(age);
		
		

	}

}
