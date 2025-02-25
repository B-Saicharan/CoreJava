package com.tnsif.homework;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {23,12,3,45,67,34,55};
		int target=45;
		int ans=linearsearch(num,target);
		System.out.println(ans);

	}
	static int linearsearch(int[] arr, int target) {
		if(arr.length == 0) {
		return -1;
		
	}
		for(int index=0;index<arr.length;index++) {
			//check for element at every index if it is target
			int element = arr[index];
			if(element==target) {
				return index;
			}
		}
		
		return -1;
		
	}}

