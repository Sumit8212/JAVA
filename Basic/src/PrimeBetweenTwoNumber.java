
public class PrimeBetweenTwoNumber {
	
	public static void primeNum(int min, int max)
	{
		int i,j,flag;
		for(i=min; i<=max; i++) 
		{		 
			flag=1;
			for(j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.print(i+" ");
		}
		
	}

	public static void main(String[] args) {
		
		
		primeNum(2,10);

	}

}
