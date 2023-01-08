package arrays;

import java.util.Arrays;

public class TwoPointerExample {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int target = 6;

    int[] result = findPair(arr, target);
    if (result != null) {
      System.out.println(Arrays.toString(result));
    } else {
      System.out.println("No pair found");
    }
  }

  public static int[] findPair(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      if (arr[left] + arr[right] == target) {
        return new int[] {arr[left], arr[right]};
      } else if (arr[left] + arr[right] < target) {
        left++;
      } else {
        right--;
      }
    }
    return null;
  }
}