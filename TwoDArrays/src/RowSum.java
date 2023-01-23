import java.util.*;
public class RowSum {
//	public static void rowWiseSum(int[][] mat) {
//		//Your code goes here
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int sum =0;
//        for(int i=0; i<n; i++)
//        {
//            for(int j=0; j<m; j++)
//            {
//                 sum = sum + mat[i][j];
//            }
//            System.out.print(sum + " ");
//            sum =0;
//        }
//	}
	
	public static void  fun(int[][] arr2d)
	{

	    for(int i=0;i<arr2d.length;i++)
	    {
	        for(int j=0;j<arr2d[i].length;j++)
	        {
	            arr2d[i][j]=2*i+j;
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr [] [] = {{1,2},{3,4}};
//		rowWiseSum(arr);
		
		
//		int[][] arr = { {1,2,4,5,7},{3,4,6,7},{5,6,7,8,9} }; 
//	    System.out.println(arr.length+arr[0].length); 
//	    System.out.println(arr[1].length);
//        
		
		
//	    int[][] arr = new int[2][2]; 
//	    fun(arr);
//	    for(int i=0;i<2;i++)
//	    {
//	        for(int j=0;j<2;j++)
//	        {
//	            System.out.print(arr[i][j]+" " );
//	        }
//	    }
		
		
		int arr[][]=new int [4][];
	    System.out.print(arr[2].length);

	}

}
