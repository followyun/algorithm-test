package com.my;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Main {
    public static void main(String[] args) {
        //两数之和的问题
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(7);
        nums.add(5);
        nums.add(10);
       SumOfTwoNumbers.isIn(nums, 12);
    }
}
