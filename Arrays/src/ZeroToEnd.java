
public class ZeroToEnd {
	
	public static void zeroEnd(int arr[], int n)
	{
		int index=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]!=0)
			{
				arr[index++] = arr[i];
			}
		}
		while(index<n)
		{
			arr[index++] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,9,8,5,0,5,0,6,7};
		 int n =arr.length;
		 
		 zeroEnd(arr,n);
		 for(int i =0; i<n; i++)
		 {
			System.out.print(arr[i] + " ");
		 }

	}

}
