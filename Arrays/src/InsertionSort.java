
public class InsertionSort {
	public static void insertionSort(int[]arr)
	{
		for(int i=1; i<arr.length; i++)
		{		
//			System.out.println(i);	
			int j = i-1;
//			System.out.println(j);
			int temp = arr[i];
			while(j>=0 && arr[j]>temp)
			{
//				System.out.println(j);
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,9,5,3,1,2};
		insertionSort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
