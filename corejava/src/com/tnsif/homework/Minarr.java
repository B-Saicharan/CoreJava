package com.tnsif.homework;

public class Minarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {18,12,-3,14,39};
		System.out.println(min(arr));

	}
	static int min(int[] arr) {
		int ans=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<ans) {
				ans=arr[i];
			}
		}
		return ans;
	}

}
