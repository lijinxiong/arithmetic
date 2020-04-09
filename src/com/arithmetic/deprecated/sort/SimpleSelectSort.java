package com.arithmetic.deprecated.sort;

import com.arithmetic.deprecated.Utils;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description 简单的选择排序.
 */
public class SimpleSelectSort implements Sort {
    @Override
    public void sort(int[] source) {

        for (int i = 0; i < source.length; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < source.length; j++) {
                if (source[maxIndex] < source[j]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Utils.swap(maxIndex, i, source);
            }
        }

    }
}
