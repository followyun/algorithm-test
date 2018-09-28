package com.my;

import java.util.Comparator;
import java.util.List;

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
        //首先将数据进行升序排序
        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        return false;
    }
}
