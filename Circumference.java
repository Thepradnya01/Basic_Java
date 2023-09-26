package Basics;

import java.util.Scanner;

public class Circumference {
	
	public static double circumCircle(int r) {
		return 2*3.14*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter radius:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println(circumCircle(r));
		
	}

}
