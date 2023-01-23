
public class LCM {
 
	
	public static int lcm(int a, int b) {
		int max = (a>b)?a:b;  // storing max btw a and b
		for(int i=max; i<=a*b; i=i+max)
		{
			if(i%a ==0 && i%b==0)
			{
				return i;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int a = 5, b=12;
		System.out.println("lcm is "+ lcm(a,b));
	}

}
