package com.arithmetic.deprecated.sort;

import com.arithmetic.deprecated.Utils;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description 堆排序 大顶堆
 */
public class HeapSort implements Sort {
    @Override
    public void sort(int[] source) {


        for (int i = source.length / 2 - 1; i >= 0; i--) {
            adjustHeap(source, i, source.length);
        }

        for (int i = source.length - 1; i > 0; i--) {
            Utils.swap(0, i, source);
            adjustHeap(source, 0, i);
        }
    }

    private void adjustHeap(int[] source, int adjustIndex, int end) {


        int left = adjustIndex * 2 + 1;
        int right = adjustIndex * 2 + 2;
        int maxIndex = adjustIndex;

        if (left < end && source[left] > source[maxIndex]) {
            maxIndex = left;
        }

        if (right < end && source[right] > source[maxIndex]) {
            maxIndex = right;
        }

        if (maxIndex != adjustIndex) {
            Utils.swap(maxIndex, adjustIndex, source);
            adjustHeap(source, maxIndex, end);
        }

    }

}
