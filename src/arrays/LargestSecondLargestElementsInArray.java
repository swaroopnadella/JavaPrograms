package arrays;

import java.util.Arrays;

public class LargestSecondLargestElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2438,232,12345,567,343,98,875,712,475,33,88,97,56,2,44,8723,7237,99999};
		
		System.out.println("Array values");
		System.out.println(Arrays.toString(arr));
		int largest1=0,largest2=0;
		
		largest1 = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest1)
				largest1 = arr[i];
		}
		
		System.out.println("Largest number in array: "+largest1);
		
		largest2=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest2 && arr[i]<largest1)
				largest2 = arr[i];
		}
		
		System.out.println("Second Largest number in array: "+largest2);
		
	}

}
