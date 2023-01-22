package com.linearSearch.entity;

public class LinearSerach {
	
	public static int linearSearch(int arr[], int x) {
		  int n = arr.length;

		  // Going through array sequencially
		  for (int i = 0; i < n; i++) {
		    if (arr[i] == x)
		    return i;
		  }
		  return -1;
	  }
	public static void main(String[] args) {
		
		int arr[] = {2,3,9,11,18,24,27,37,40};
		
		  int x = 19;

		  int result = linearSearch(arr, x);

		  if (result == -1)
		    System.out.print("Element not found");
		  else
		    System.out.print("Element found at index: " + result);
		  }
}
