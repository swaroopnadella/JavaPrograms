package arrays;

import java.util.Arrays;

public class TransposeMatrixOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Change Rows to Columns
		
		int input[][]= {{2,4,6},{1,3,5},{7,8,9}};
		
		System.out.println("Values Of Input Array");
		System.out.println(Arrays.deepToString(input));
		
		int output[][]=new int[3][3];
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++)
				output[i][j]=input[j][i];
		}
		
		System.out.println("Values Of Output Array");
		System.out.println(Arrays.deepToString(output));
	}
}
