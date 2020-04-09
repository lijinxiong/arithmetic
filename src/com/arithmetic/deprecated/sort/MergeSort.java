package com.arithmetic.deprecated.sort;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] source) {
        part(source, 0, source.length - 1);
    }

    private void part(int[] source, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        part(source, left, mid);
        part(source, mid + 1, right);
        merge(source, left, mid, right);

    }

    private void merge(int[] source, int left, int mid, int right) {

        // 本身已经有序了
        if (source[mid] <= source[mid + 1]) {
            return;
        }

        int[] tem = new int[right - left + 1];
        int i = 0;
        int leftStart = left;
        int rightStart = mid + 1;

        while (leftStart <= mid && rightStart <= right) {
            tem[i++] = source[leftStart] <= source[rightStart] ? source[leftStart++] : source[rightStart++];
        }

        while (leftStart <= mid) {
            tem[i++] = source[leftStart++];
        }

        while (rightStart <= right) {
            tem[i++] = source[rightStart++];
        }

        for (int value : tem) {
            source[left++] = value;
        }


    }

}

