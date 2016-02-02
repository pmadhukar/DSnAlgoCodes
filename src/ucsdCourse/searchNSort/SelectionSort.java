package ucsdCourse.searchNSort;

public class SelectionSort {
	public static void selectionSort( int[] arr ) {
		for( int i=0; i<arr.length-1; i++ ) {
			System.out.println("i=" + i);
			System.out.println("Array before sorting: ");
			display(arr);

			int indexOfMin = i;
			//index = indexOfMin(arr, i);

			for( int j=i+1; j<arr.length; j++ ) {
				if( arr[j] < arr[indexOfMin] ) {
					indexOfMin = j;
				}
			}

			if( arr[indexOfMin] != arr[i] ) {
				swap(arr, i, indexOfMin);
			}

			System.out.println("Array after sorting: ");
			display(arr);
			System.out.println();
		}
	}

	/*
	public static int indexOfMin( int[] arr, int start ) {
		int index = start;
		int min = arr[index];
		for( int i=start+1; i<arr.length; i++ ) {
			if( arr[i] < min ) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}
	*/

	public static void swap( int[] arr, int posA, int posB ) {
		int temp;
		temp = arr[posA];
		arr[posA] = arr[posB];
		arr[posB] = temp;
	}


	public static void main(String[] args) {
		int arr[] = {2, 1, 9, 3, 5, 4, 7, 6, 8};
		selectionSort(arr);

		System.out.println("Sorted array: ");
		display(arr);

	}

	public static void display( int[] arr ) {
		for( int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
