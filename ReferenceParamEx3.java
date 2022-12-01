package jungsuk_coding_oop;

import java.util.Arrays;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		sortArr(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	static void sortArr(int[] arr) {
		for(int i = 0 ; i < arr.length-1; i++) {
			for(int j = 0 ; j < arr.length-1-i ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
	}


}

