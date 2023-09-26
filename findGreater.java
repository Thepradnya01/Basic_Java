package Basics;
import java.util.*;

public class findGreater {
	
	public static int findGreaterNum(int a,int b) {
		return (a>b?a:b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
	
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(findGreaterNum(a,b));
		

	}

}
