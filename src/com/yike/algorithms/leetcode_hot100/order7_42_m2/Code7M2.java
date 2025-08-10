package com.yike.algorithms.leetcode_hot100.order7_42_m2;

/**
 * @author: jyk
 * @description: leetcode 42题：接雨水 方法2: 双指针做法
 * @date: 2025/8/10 17:14
 * @version: 1.0
 */
public class Code7M2 {
    public int trap(int[] height) {
        int len = height.length;
        int left_max = height[0];
        int right_max = height[len-1];
        int left = 1, right = len - 2; // 首尾肯定是接不了水的，所以跳过
        int sum = 0;

        while(left <= right) {
            left_max = Math.max(left_max, height[left]);
            right_max = Math.max(right_max, height[right]);

            if (left_max < right_max) {
                sum += left_max - height[left];
                left++;
            } else {
                sum += right_max - height[right];
                right--;
            }

        }
        return sum;

    }
}
