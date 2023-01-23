
public class SelectionSort {
	public static void selectionSort(int [] arr)
	{
		for (int i=0; i<arr.length-1; i++)  // 0 to length-2 for round
		{
			int min = arr[i];
			int minIndex = i;
			for ( int j=i+1; j<arr.length; j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					minIndex=j;
				}
			}
			if(minIndex!=i)
			{
				arr[minIndex]=arr[i];
				arr[i]=min;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []input= {10,9,6,3,8};
		selectionSort(input);
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

}
