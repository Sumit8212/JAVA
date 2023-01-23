import java.lang.*;
public class Armstrong {

	public static void main(String[] args) {
		
		int num = 123, result=0;
		
		while(num!=0)
		{
			int digit = num%10;
			result= (int) Math.pow(digit, 3); // powwr function return double type value
			num = num/10;
		}
		if(num==result) System.out.println(num+ " is armstrong");
		else System.out.println(num + " is not a");

	}

}
