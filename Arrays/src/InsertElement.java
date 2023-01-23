import java.util.*;

public class InsertElement {

	// INSERTING ELEMENT AT LAST PLACE

	public static void insertLast(int[] arr, int elem, int n) {
		int[] arrNew = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arrNew[i] = arr[i];

			arrNew[n] = elem;
		}
		System.out.println("Array with " + elem + " added:\n" + Arrays.toString(arrNew));
	}

	// INSERTING ELEMENT AT FIRST PLACE

	public static int[] insertFirst(int[] arr, int elem, int n) {

		int[] arrNew = new int[n + 1];

		for (int i = 0; i < n; i++) {

			arrNew[i + 1] = arr[i];
			arrNew[0] = elem;

		}

		return arrNew;
	}

	// INSERTING ELEMENT AT GIVEN POSITION(INDEX)

	public static void insertAtAnyPos(int[] arr, int pos, int n, int elem) {

		int[] newArr = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			if (i < pos)
				newArr[i] = arr[i];
			else if (i == pos)
				newArr[i] = elem;
			else
				newArr[i] = arr[i - 1];
		}
		System.out.println("Array with " + elem + " added:\n" + Arrays.toString(newArr));
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int size = arr.length;
//		insertLast(arr, 7, size);
//		arr = insertFirst(arr, 5, size);
//		System.out.println("Arrays with added:\n"+Arrays.toString(arr));
		insertAtAnyPos(arr, 3, size, 100);
	}

}
