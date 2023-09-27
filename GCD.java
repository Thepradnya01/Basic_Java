// 12,16 , 1. find small no
		          // check if big divisible by small, then gcd=small
		          //check from small//2, check for 6,5, 4--- 16%4==0 and 12%4==0--> gcd= 4 break
		          // this is not at all optimal solution but my first try

package Basics;
import java.util.*;


public class GCD {
	
	
	public static int GCD(int a,int b) {
		
		int small,big;
		
		
		if(a<b) {
			small=a;
			big=b;
			
		}
		else if(b<a) {
			small=b;
			big=a;
		}
		else
			return a;
		
		
		if(big%small==0) {
			System.out.println(small);
			return small;}
		
		
		else {
			for(int i=small/2;i>=1;i--) {
				if(small%i==0 & big%i==0) {
					return i;
				}
						
			}
		return 1;
			
	   
		}
			
			
		
		
			
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//System.out.println(b/a);
		System.out.println(GCD(a,b));
		
		
		

	}

}
