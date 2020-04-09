package com.arithmetic.deprecated.sort;

import java.util.Arrays;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Main {

    public static void main(String[] args) {

        int[] source = {12, 1, 45, 10, 0, 56, 85};
        Sort sort;

        sort = new SimpleSelectSort();
        sort = new HeapSort();
        sort = new BubbleSort();
        sort = new QuickSort();
        sort = new InsertSort();
        sort = new ShellSort();
        sort = new MergeSort();
        sort = new RadixSort();
        sort.sort(source);
        System.out.println(Arrays.toString(source));

    }
}
