package arrays;

import java.util.Arrays;

public class SortArrayUsingInBuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {121,232,221,11,54,544,121231,575543,8676,353,989,66,687,34};
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println("Sorted Array is below");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
