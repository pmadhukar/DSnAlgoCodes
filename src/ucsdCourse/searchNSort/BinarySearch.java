package ucsdCourse.searchNSort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int rank(int key, int a[]){
		int low = 0;
		int high = a.length - 1;

		while(low <= high){
			//to prevent overflow
			int mid = low + (high-low)/2;

			if( key < a[mid] ) high = mid - 1;
			else if( key > a[mid] ) low = mid + 1;
			else  return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] whitelist = {9, 1, 2, 5, 3, 8, 4, 7, 6, 0};

		System.out.println("The array is: ");
		for( int i=0; i<whitelist.length; i++ ) {
			System.out.print(whitelist[i] + " ");
		}

		Arrays.sort(whitelist);

		System.out.println("\nEnter the element you want to search: ");
		int key = in.nextInt();

		int foundAt = rank(key, whitelist);
		if( foundAt == -1 ) {
			System.out.println("Element " + key + " not found.");
		}
		else {
			System.out.println("Element " + key + " found.");
		}

		in.close();
	}

}
