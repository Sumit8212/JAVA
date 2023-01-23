import java.util.*;
public class GCD {
	 
	public static int gcd(int a, int b){
		int min ;
		if(a>b) min = b;
		else min = a;
		for(int i=min; i>1;i--)
		{
			if(a%i == 0 && b%i==0)
			{
				return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		
		int a=8, b=24;
		System.out.print("gcd is "+ gcd(a,b));
		
	}

}
