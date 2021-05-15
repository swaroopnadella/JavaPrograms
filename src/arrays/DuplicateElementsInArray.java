package arrays;

import java.util.Arrays;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {33,54,12,22,33,78,99,3,12,78,90,99,15,2,3,90,22,56};
		
		System.out.println("Values In Array");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\nDuplicate Elements in Array are below");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}

}
