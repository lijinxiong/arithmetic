package com.arithmetic.deprecated.sort;

import com.arithmetic.deprecated.Utils;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description 交换排序--快速排序
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] source) {
        sort(source, 0, source.length - 1);
    }

    public void sort(int[] source, int left, int right) {

        if (left >= right) {
            return;
        }

        int start = left;
        int end = right;
        int baseValue = source[left];

        while (left < right) {

            while (left < right && source[right] >= baseValue) {
                right--;
            }


            while (left < right && source[left] <= baseValue) {
                left++;
            }

            if (left < right) {
                Utils.swap(left, right, source);
            }

        }

        Utils.swap(start, left, source);
        sort(source, start, left);
        sort(source, left + 1, end);


    }
}
