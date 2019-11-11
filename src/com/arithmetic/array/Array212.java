package com.arithmetic.array;

/**
 * Created by lijinxiong on 2019/11/11
 * <p>
 * 在 Array211 的基础上、允许重复的次数最多为 2 次
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Array212 {


    /**
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {

        // 处理边界情况
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length <= 2) {
            return nums.length;
        }

        int slowPointer = 1;

        for (int i = 2; i < nums.length; i++) {

            if (nums[slowPointer - 1] != nums[i]) {
                slowPointer++;
                nums[slowPointer] = nums[i];
            }
        }

        return slowPointer + 1;
    }


    public int removeDuplicates(int[] nums, int duplicateCount) {

        if (nums.length <= duplicateCount) {
            return nums.length;
        }

        // 慢指针 比 快指针 差一个身位
        int slowPointer = duplicateCount - 1;

        for (int i = duplicateCount; i < nums.length; i++) {

            // 不等于最左边的值
            if (nums[i] != nums[slowPointer - (duplicateCount - 1)]) {
                slowPointer++;
                nums[slowPointer] = nums[i];
            }
        }
        return slowPointer + 1;
    }

}
