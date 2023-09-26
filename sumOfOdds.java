package Basics;
import java.util.*;


public class sumOfOdds {
	
	public static int oddSum(int n) {
		if(n%2==0)
			n-=1;
		int sum=0;
		
		for(int i=1;i<=n;i=i+2) {
			sum=sum+i;
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println(oddSum(n));

	}

}
