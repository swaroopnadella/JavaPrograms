package arrays;

import java.util.Arrays;

public class MaxElementInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the Maximum Element in a Matrix
		
		int arr[][]= {{898,92921,123,213,122},{48389,93000,91,2121,438},{72187,71,98,8,44}};
		
		System.out.println("Input 2D Array");
		System.out.println(Arrays.deepToString(arr));
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				max = Math.max(arr[i][j], max);
			}
		}
		
		System.out.println("Maximum Element in Matrix: "+max);
		
	}

}
