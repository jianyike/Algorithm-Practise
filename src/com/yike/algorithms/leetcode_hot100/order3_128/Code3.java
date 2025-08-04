package com.yike.algorithms.leetcode_hot100.order3_128;

import java.util.HashSet;
import java.util.Set;

/**
 * @projectName: AlgorithmPractise
 * @package: com.yike.algorithms.leetcode_hot100.order3_128
 * @className: Code3
 * @author: jyk
 * @description: TODO
 * @date: 2025/7/28 20:16
 * @version: 1.0
 */
public class Code3 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            /**
             * 1. hashset的使用
             * 2. 先创建集合Set
             * 3. 然后遍历，逐个判断是否是序列的起始元素。否：遍历下一个；是：查集合是否存在下一个元素，记录并更新长度
             */
            Set<Integer> set = new HashSet<>();
            for(int i = 0;i < nums.length;i ++){
                set.add(nums[i]);
            }
            int ans = 0;
            for(Integer em : set){
                if(!set.contains(em - 1)){// 不包含前一个，说明是起始
                    int cnt = 1;
                    int tmp = em;
                    while(set.contains(++em)){
                        cnt ++;
                    }
                    if(cnt > ans)ans = cnt;
                }// 包含前一个，说明不是起始元素
            }
            return ans;
        }
    }
}
