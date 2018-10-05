package com.my;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 两三个数之和的问题
 * 输入1： [4,7,8,11, 7]
 * target: 22
 * 输出：true
 * 输入2： [4,5,7,10, 9]
 * target：9
 * 输出：false
 */
public class SumOfThreeNumbers {
    public static boolean isIn(List<Integer> nums, int targetValue) {
        for(int num:nums) {
            int value = targetValue - num;

            Set<Integer> appeared = new HashSet<>();
            for (int num1 : nums.subList(1, nums.size())) {
                if (appeared.contains(value - num1)) {
                    return true;
                }
                appeared.add(num1);
            }
        }
        return false;
    }
}
