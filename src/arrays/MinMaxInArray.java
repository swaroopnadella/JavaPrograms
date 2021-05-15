package arrays;

import java.util.Arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4332, 23, 12, 32, 7, 55, 99999, 43, 789, 4334, 6867, 531, 313, 34654, 8731, 9289, 111, 322,
				9943 };
		System.out.println("Values In Array");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		
		System.out.println("Sorted Array using Inbuilt method");
		System.out.println(Arrays.toString(arr));

		System.out.println("Min value in Array: " + arr[0]);
		System.out.println("Max value in Array: " + arr[arr.length - 1]);
		
		int arr1[] = { 4332, 23, 12, 32, 7, 55, 99999, 43, 789, 4334, 6867, 531, 313, 34654, 8731, 9289, 111, 322,
				9943 };
		System.out.println("Values In Array");
		System.out.println(Arrays.toString(arr1));
		sortArray(arr1);
		System.out.println("Sorted Array using Bubble sort");
		System.out.println(Arrays.toString(arr1));

		System.out.println("Min value in Array: " + arr1[0]);
		System.out.println("Max value in Array: " + arr1[arr1.length - 1]);
	}

	public static void sortArray(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

}
