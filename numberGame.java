package Basics;
import java.util.*;

public class numberGame {
	
	public static void numberCalculate(int n) {
		Scanner sc=new Scanner(System.in);
		int positive=0;
		int negative=0;
		int zero=0;
		
		for(int i=1;i<=n;i++) {
			int a= sc.nextInt();
			if(a>0)
				positive+=1;
			else if(a<0)
				negative+=1;
			else
				zero+=1;
		}
		System.out.println("Okay finished, now wait for results");
		System.out.println("You entered "+positive+ " Positive numbers , "+negative+ " Negative numbers and "+zero+" times 0.");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter?");
		int n= sc.nextInt();
		
		numberCalculate(n);
		

	}

}
