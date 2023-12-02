package com.brendosp.easy.RunningSumOf1DArray;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(runningSumV1(new int[]{1, 2, 3, 4})));
    System.out.println(Arrays.toString(runningSumV2(new int[]{1, 2, 3, 4})));
  }

  public static int[] runningSumV1(int[] nums) {
    int[] output = new int[nums.length];
    int sum = 0;

    for (int index = 0; index < nums.length; index++) {
      sum += nums[index];
      output[index] = sum;
    }

    return output;
  }

  public static int[] runningSumV2(int[] nums) {
    for (int index = 1; index < nums.length; index++) {
      nums[index] += nums[index - 1];
    }

    return nums;
  }
}
