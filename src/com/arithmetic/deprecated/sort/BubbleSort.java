package com.arithmetic.deprecated.sort;

import com.arithmetic.deprecated.Utils;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description 交换排序--冒泡排序.
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] source) {


        for (int i = source.length - 1; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (source[j] < source[j + 1]) {
                    Utils.swap(j, j + 1, source);
                    sorted = false;
                }
            }
            if (sorted) {
                return;
            }
        }

    }
}
