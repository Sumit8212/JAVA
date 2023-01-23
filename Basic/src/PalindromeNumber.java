
public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=123321,rev=0, temp=num;
		
		while(temp!=0)
		{
			int digit= temp%10;
			rev = rev*10+digit;
			temp=temp/10;
		}
		if(num == rev) System.out.println(num + " is palindrome.");
		else System.out.println(num + " is not palindrome");

	}

}
