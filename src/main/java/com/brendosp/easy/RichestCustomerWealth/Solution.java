package com.brendosp.easy.RichestCustomerWealth;

public class Solution {
  public static void main(String[] args) {
    int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
    System.out.println(maximumWealth(accounts));
  }

  public static int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
    for (int[] customer : accounts) {
      int customerWealth = 0;
      for (int bankAccount : customer) {
        customerWealth += bankAccount;
      }
      if (customerWealth > maxWealth) {
        maxWealth = customerWealth;
      }
    }

    return maxWealth;
  }
}
