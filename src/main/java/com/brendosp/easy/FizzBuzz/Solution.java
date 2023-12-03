package com.brendosp.easy.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    System.out.println(fizzBuzz(15));
  }

  // Runtime 1ms
  public static List<String> fizzBuzz(int n) {
    List<String> answer = new ArrayList<>();
    for (int index = 1; index <= n; index++) {
      if (index % 3 == 0 && index % 5 == 0) {
        answer.add("FizzBuzz");
      } else if (index % 3 == 0) {
        answer.add("Fizz");
      } else if (index % 5 == 0) {
        answer.add("Buzz");
      } else {
        answer.add(String.valueOf(index));
      }
    }

    return answer;
  }

  // Runtime 2ms
//  public static List<String> fizzBuzz1(int n) {
//    List<String> answer = new ArrayList<>();
//    for (int index = 1; index <= n; index++) {
//      if (isDivisibleBy3(index) && isDivisibleBy5(index)) {
//        answer.add("FizzBuzz");
//      } else if (isDivisibleBy3(index)) {
//        answer.add("Fizz");
//      } else if (isDivisibleBy5(index)) {
//        answer.add("Buzz");
//      } else {
//        answer.add(String.valueOf(index));
//      }
//    }
//
//    return answer;
//  }
//
//  private static boolean isDivisibleBy3(int num) {
//    return num % 3 == 0;
//  }
//
//  private static boolean isDivisibleBy5(int num) {
//    return num % 5 == 0;
//  }
}
