package codesAlgorithms;

import java.util.Arrays;

public class BinarySearch {

	public static int rank(int key, int a[]){
		int low = 0;
		int high = a.length - 1;

		while(low <= high){
			int mid = low + (high-low)/2;
			if( key < a[mid] ) high = mid - 1;
			else if( key > a[mid] ) low = mid + 1;
			else  return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whitelist = {9, 1, 2, 5, 3, 8, 4, 7, 6, 0};
		Arrays.sort(whitelist);

		for(int i=0; i<whitelist.length; i++){
			System.out.print(whitelist[i] + " ");
		}
	}

}
