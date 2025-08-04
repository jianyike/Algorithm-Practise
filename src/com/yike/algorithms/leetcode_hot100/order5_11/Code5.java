package com.yike.algorithms.leetcode_hot100.order5_11;

/**
 * @projectName: AlgorithmPractise
 * @package: com.yike.algorithms.leetcode_hot100.order5_11
 * @className: Code5
 * @author: jyk
 * @description: TODO
 * @date: 2025/7/30 11:02
 * @version: 1.0
 */
public class Code5 {

    class Solution {
        public int maxArea(int[] height) {
            /**
             * 首先明确体积的计算公式，宽 * min(left, right)
             * 然后使用双指针法，分别指向首尾，向中间移动，就能使用O(n)的
             */
            int len = height.length;
            int left = 0, right = len - 1;
            int ans = 0;
            while(left != right){
                int area = (right - left) * Math.min(height[left], height[right]);
                ans = Math.max(ans, area);
                if(height[left] < height[right]){
                    left ++;
                }else{
                    right --;
                }

            }
            return ans;


        }
    }
}
