package com.arithmetic.deprecated.one;

import java.util.HashMap;

/**
 * Created by lijinxiong on 2019/11/8
 * 计算两数之和
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class TwoSum {


    public static void main(String[] args) {


    }


    /**
     * 从 source 中找出 两个数、相加的和等于 target
     *
     * @param nums   可选值得数组
     * @param target 目标值
     * @return 两个数的下标
     */
    private static int[] twoSum(int[] nums, int target) {

        // 处理边界情况
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        HashMap<Integer, Integer> valueIndexMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {

            int result = target - nums[i];

            if (valueIndexMap.containsKey(result)) {
                return new int[]{valueIndexMap.get(result), i};
            }

            valueIndexMap.put(nums[i], i);
        }

        return new int[]{-1, -1};


    }


}
