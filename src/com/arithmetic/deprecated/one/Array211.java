package com.arithmetic.deprecated.one;

/**
 * Created by lijinxiong on 2019/11/11
 * <p>
 * Given a sorted array, remove the duplicates in place such that each element appear only once
 * and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example, Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Array211 {


    /**
     * 找出元素中不重复的元素个数 n 、并且将原数组中的0~n-1的位置存放的就是没有重复的元素
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {


        if (nums.length <= 1) {
            return nums.length;
        }


        int slowPointer = 0;
        for (int i = 1; i < nums.length; i++) {


            if (nums[slowPointer] != nums[i]) {
                slowPointer++;
                nums[slowPointer] = nums[i];
            }
        }

        return slowPointer + 1;

    }
}
