package arrays;

import java.util.Arrays;

public class ElementsInOddPositionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print the Elements of an Array Present on Odd Position
		
		int arr[]= {98,39,23,32,121,25,64,88,67,47,12,13,23,34,75,66};
		
		System.out.println("Input 2D Array");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Elements in Odd positions of the Array");
		for(int i=0;i<arr.length;i++)
			if(i%2==0)
				System.out.print(arr[i]+" ");
	}

}
