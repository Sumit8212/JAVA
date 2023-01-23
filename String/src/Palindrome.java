
public class Palindrome {
	
	static boolean checkPalindrome(String str)
	{
		int min=0; int max=str.length()-1;
		boolean isPaindrome = true;
		while(min<=max)
		{
			if(str.charAt(min)!=str.charAt(max))
			{
				return false;
			}
			min++;
			max--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdba";
		System.out.println(checkPalindrome(str));

	}

}
