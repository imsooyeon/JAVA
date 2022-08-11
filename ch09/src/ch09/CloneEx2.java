package ch09;

import java.util.*;

class CloneEx2 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};

		// 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		int[] arrClone = arr.clone(); 
		/*
		 int[] arr = {1,2,3,4,5};
		 int[] arrClone = new int[arr.length];
		 System.arraycopy(arr,0,arrClone,0,arr.length)
		 이렇게 복사도 가능.*/
		arrClone[0]= 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}