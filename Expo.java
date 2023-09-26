package Basics;
import java.util.*;
import java.lang.Math;



public class Expo {
	
	public static double calExpo(int x,int n) {
		return Math.pow(x, n);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers x and n, and we will calculate n raised to n:");
		
		int x= sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println(calExpo(x,n));
		

	}

}
