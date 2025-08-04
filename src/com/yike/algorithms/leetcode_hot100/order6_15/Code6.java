package com.yike.algorithms.leetcode_hot100.order6_15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @Author: jyk
 * @Description: TODO
 * @Date: 2025-08-04 20:43
 */

public class Code6 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            /**
             * - 如何返回列表，
             * - 题目特点，就在目标是和为0，这就说明3个数，必然是有正有负
             * 而排序后的数组有个特点，就是前面是负数，后面是正数，双指针天然就可以分别从首尾开始
             * - 排序的作用，方便去重复，如何去重，跳重复的都挨在一块，一起跳过即可
             * 1. 第一个数去重
             * 2. 两个指针去重
             */

            // 排序
            Arrays.sort(nums);


            List<List<Integer>> ans = new ArrayList<>();


            int len = nums.length;
            for(int i = 0;i < len;i ++){
                if(nums[i] > 0) break;
                if(i > 0 && nums[i] == nums[i-1]) continue;
                int left = i + 1, right = len - 1;
                while(left < right){
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0){

                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && nums[++left] == nums[left - 1]);
                        while(left < right && nums[--right] == nums[right + 1]);

                    }else if(sum < 0){
                        left ++;
                    }else{
                        right --;
                    }

                }
            }
            return ans;

        }
    }
}
