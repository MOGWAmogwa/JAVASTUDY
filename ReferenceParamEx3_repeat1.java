package jungsuk_coding_oop;

import java.util.Arrays;

public class ReferenceParamEx3_repeat1 {

	public static void main(String[] args) {
			int[] arr = {4,1,5,2,2,3,4,1};
			
			
			for(int i = 0 ; i < arr.length-1; i++) {
				for(int j = 0 ; j < arr.length-1-i; j++) {
					if(arr[j] > arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}
			
			System.out.println(Arrays.toString(arr));

	}

}
