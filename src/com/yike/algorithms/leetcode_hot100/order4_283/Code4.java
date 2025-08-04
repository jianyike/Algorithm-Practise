package com.yike.algorithms.leetcode_hot100.order4_283;

/**
 * @projectName: AlgorithmPractise
 * @package: com.yike.algorithms.leetcode_hot100.order4_283
 * @className: Code4
 * @author: jyk
 * @description: TODO
 * @date: 2025/7/29 21:25
 * @version: 1.0
 */
public class Code4 {

    class Solution {
        public void moveZeroes(int[] nums) {
            /**
             * 本质就是遍历所有元素，把非零的元素全部移到最前面
             * 最简单的方式就是开一个空数组，把原数组的非零的元素全部移到新数组的最前面
             * 然后再思考如何不开辟新数组，在原数组上操作
             */
            int low, fast;
            for(low = 0,fast = 0;fast < nums.length;fast ++){
                if(nums[fast] != 0) nums[low++] = nums[fast];
            }
            for(int i = low;i < nums.length;i ++){
                nums[i] = 0;
            }

        }
    }
}
