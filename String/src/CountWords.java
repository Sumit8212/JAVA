import java.util.*;
public class CountWords {
	public static int wordCount(String str)
	{
		int noOfWords=1;
		if(noOfWords == 0)
		{
			noOfWords --;
		}
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				noOfWords ++;
			}
		}
		return noOfWords;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int ans = wordCount(str);
	    System.out.println(ans);
	}

}
