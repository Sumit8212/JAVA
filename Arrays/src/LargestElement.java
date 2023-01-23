import java.util.*;
public class LargestElement {
	
	public static int largestInArray(int inp[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<inp.length; i++) {
			if(inp[i]>max) {
				max=inp[i];
			}
		}
		
		return max;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input [] = new int[size];
		for(int i=0; i<size; i++) {
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =takeInput();
		int largest = largestInArray(arr);
		System.out.println("largest " + largest);

	}

}
