package com.brendosp.easy.NumberOfStepsToReduceANumberToZero;

public class Solution {
  public static void main(String[] args) {
    System.out.println(numberOfSteps(123));
  }

  public static int numberOfSteps(int num) {
    int steps = 0;

    while (num > 0) {
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num--;
      }
      steps++;
    }

    return steps;
  }
}
