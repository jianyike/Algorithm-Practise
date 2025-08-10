package com.yike.algorithms.leetcode_hot100.order7_42;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: jyk
 * @description: leetcode 42题：接雨水 方法1:前缀和做法
 * @date: 2025/8/9 15:36
 * @version: 1.0
 */
public class Code7 {
    public int trap(Integer[] height) {
        /**
         * 首先得找到有哪些坑
         * 每个坑里雨水的体积，取决于左右最高的块里最小的那个min(left, right)
         * 每个坑雨水体积计算公式，每个i位置桶里能接的雨水=左右最小高度-当前块的高度
         * 一个数组存储每个位置i左边最大的高度
         * 另一个数组存储每个位置i右边最大的高度
         * 一层一层地计算空档，每次一层都找两个边界，然后计算缺失的方块数量
         */
        /**
         * 使用前缀和
         * 空间复杂度O(n)
         * 事件复杂度O(n)
         */
        int len = height.length;
        int[] left_max = new int[len];
        int[] right_max = new int[len];

        // 初始化
        left_max[0] = height[0];
        right_max[len - 1] = height[len - 1];

        for(int i = 1;i < len;i ++){
            left_max[i] = Math.max(left_max[i-1], height[i]);
        }
        for(int i = len - 2;i >= 0;i --){
            right_max[i] = Math.max(right_max[i+1], height[i]);
        }

        int sum = 0;
        for(int i = 0;i < len;i ++){
            if(left_max[i] <= height[i] || right_max[i] <= height[i]) continue;
            sum += Math.min(left_max[i], right_max[i]) - height[i];
        }
        return sum;

    }

//    public static int MAX = (int) (2e4 + 10);
//    public static int[] height = new int[MAX];

    public static void main(String[] args) throws IOException {
        // 得到字符输入缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 得到字符输出流
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] parts = line.split(",");
        List<Integer> list = new ArrayList<>();
        // 题目的height数组
        for(String part : parts){
            list.add(Integer.parseInt(part));
        }
        Integer[] height = list.toArray(new Integer[list.size()]);
        Code7 obj = new Code7();
        int ans = obj.trap(height);
//        System.out.println(ans);// 不推荐
        pw.println(ans);// 推荐

        pw.flush();// 必须写，否则在终端看不到输出
        br.close();
        pw.close();
    }
}
