
public class nextLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {4,10,5,15,7};
		int i,j;
		
		for (i=0; i<arr.length; i++)
		{
			for(j=1; j<arr.length-1; j++)
			{
				if(arr[i] <arr[j])
					arr[i] = arr[j];
				else arr[i] =-1;
			}
		}
		
		System.out.print(arr[i]);

	}

}
