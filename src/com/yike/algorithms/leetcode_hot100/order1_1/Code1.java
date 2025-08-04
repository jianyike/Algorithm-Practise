package com.yike.algorithms.leetcode_hot100.order1_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: AlgorithmPractise
 * @package: com.yike.algorithms.leetcode_hot100.order1
 * @className: Code1
 * @author: jyk
 * @description: TODO
 * @date: 2025/7/28 11:21
 * @version: 1.0
 */
public class Code1 {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i = 0;i < nums.length;i ++){
                map.put(nums[i], i);
            }
            for(int i = 0;i < nums.length;i ++){
                if(map.containsKey(target - nums[i])){
                    return new int[]{i, map.get(target - nums[i])};
                }
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        Code1 code1 = new Code1();
        Solution solution = code1.new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}
