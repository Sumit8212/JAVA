
public class DecIncNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=n;i++)
		{
			if(i==1) continue;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
