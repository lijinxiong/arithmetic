package com.arithmetic.deprecated.sort;

import com.arithmetic.deprecated.Utils;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description 插入排序---希尔排序
 */
public class ShellSort implements Sort {

    @Override
    public void sort(int[] source) {


        int increment = source.length;

        while (increment > 1) {
            increment /= 3 + 1;

            for (int i = increment; i < source.length; i++) {
                for (int j = i; j - increment >= 0; j -= increment) {
                    if (source[j] >= source[j - increment]) {
                        break;
                    }
                    Utils.swap(j, j - increment, source);
                }
            }
        }
    }
}
