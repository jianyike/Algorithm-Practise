package com.yike.algorithms.leetcode_hot100.test;


import java.util.Arrays;

/**
 * @projectName: AlgorithmPractise
 * @package: com.yike.algorithms.leetcode_hot100.test
 * @className: main
 * @author: jyk
 * @description: TODO
 * @date: 2025/7/28 19:33
 * @version: 1.0
 */
public class main {

    public static void main(String[] args) {
        String str = "hello";
        char[] chars = str.toCharArray();  // 转为字符数组
        Arrays.sort(chars);                // 对字符数组排序
        String sortedStr = new String(chars); // 重组为字符串
        System.out.println(sortedStr);     // 输出: ehllo
    }


}
