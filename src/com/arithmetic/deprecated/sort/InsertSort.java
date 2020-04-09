package com.arithmetic.deprecated.sort;

import com.arithmetic.deprecated.Utils;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description 插入排序--直接插入.
 */
public class InsertSort implements Sort {
    @Override
    public void sort(int[] source) {


        for (int i = 1; i < source.length; i++) {


            for (int j = i; j - 1 >= 0; j--) {


                if (source[j] < source[j - 1]) {
                    Utils.swap(j, j - 1, source);
                } else {
                    break;
                }

            }

        }

    }
}
