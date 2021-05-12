package arrays;

import java.util.Arrays;

public class SortArrayWithoutInBuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4732,2783,84,39,23,348,9483,121,232,374,8347,325,6523,965,8745};
		
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		
		System.out.println("\nSorted Array");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\nUsing print array for loop");
		printArray(arr);
		
	}
	
	public static void printArray(int a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
