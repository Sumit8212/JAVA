
public class Prime {

	public static boolean isPrime(int num) {
		
		for(int i=2; i<=num/2; i++)
		{
			
			if(num%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num = 4;
		System.out.println(isPrime(num));
		
		// below code for printing prime number between two interval
//		int low =2, high=100;
//		for(int i=low; i<=high; i++)
//		{
//			if(isPrime(i)) System.out.print(i+" ");
//		}
//		
		
//		if (isPrime(15)) System.out.println("number is prime");
//		else System.out.println("number is not prime");

	}

}
