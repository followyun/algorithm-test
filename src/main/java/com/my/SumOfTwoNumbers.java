package com.my;

import com.my.utils.MyBinarySearchTree;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 两数之和的问题
 * 输入1： [4,7,8,11]
 * target: 12
 * 输出：true
 * 输入2： [4,5,7,10]
 * target：8
 * 输出：false
 */
public class SumOfTwoNumbers {
    public static boolean isIn(List<Integer> nums, int targetValue) {
        Set<Integer> appeared = new HashSet<>();
        for(int num:nums){
            if(appeared.contains(targetValue - num)){
                return true;
            }
            appeared.add(num);
        }

        return false;
    }
}
