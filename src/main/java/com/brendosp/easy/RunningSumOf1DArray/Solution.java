package com.brendosp.easy.RunningSumOf1DArray;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
  }

  public static int[] runningSum(int[] nums) {
    int[] output = new int[nums.length];
    int sum = 0;

    for (int index = 0; index < nums.length; index++) {
      sum += nums[index];
      output[index] = sum;
    }

    return output;
  }


}
