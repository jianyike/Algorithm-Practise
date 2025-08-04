package com.yike.algorithms.leetcode_hot100.order2_49;

import java.util.*;

/**
 * @projectName: AlgorithmPractise
 * @package: com.yike.algorithms.leetcode_hot100.order2
 * @className: Code2
 * @author: jyk
 * @description: TODO
 * @date: 2025/7/28 18:36
 * @version: 1.0
 */
public class Code2 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            /**
             * 1. List集合的使用
             *  1.1 List的创建
             *  1.2 List转数组，使用Arrays的方法
             * 2. 如何判断两个词时字母异位词
             *  2.1 每个字符串排序后都是相同的 ->  字符串如何排序
             *  2.2 统计每个字符串中字符出现的次数都是相同的
             * 3. 如何将map的值转换为List
             */
            Map<String, List<String>> map = new HashMap<>();
            for(int i = 0; i < strs.length; i ++){
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                if(map.containsKey(sorted)){
                    List<String> list = map.get(sorted);
                    list.add(strs[i]);
                }else{
                    List<String> list = new ArrayList<>();
                    list.add(strs[i]);
                    map.put(sorted, list);
                }

            }
            return new ArrayList<>(map.values());

        }
    }
}
