package com.arithmetic.deprecated.sort;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description 基数排序 低位
 */
public class RadixSort implements Sort {

    @Override
    public void sort(int[] source) {
        sort(source, getMaxDigit(source));
    }

    public void sort(int[] source, int maxDigit) {

        int[][] bucket = new int[20][];
        int dev = 1;
        int mod = 10;

        while (maxDigit > 0) {

            for (int value : source) {
                int index = value % mod / dev + 10;
                bucket[index] = append(bucket[index], value);
            }


            int i = 0;
            for (int j = 0; j < bucket.length; j++) {
                int[] value = bucket[j];
                if (value == null) {
                    continue;
                }

                System.arraycopy(value, 0, source, i, value.length);
                i += value.length;
                bucket[j] = null;
            }


            maxDigit--;
            dev *= 10;
            mod *= 10;

        }


    }

    private int[] append(int[] ints, int value) {

        if (ints == null) {
            return new int[]{value};
        }

        int[] newInts = new int[ints.length + 1];

        System.arraycopy(ints, 0, newInts, 0, ints.length);
        newInts[newInts.length - 1] = value;
        return newInts;
    }


    private int getMaxDigit(int[] source) {

        int absMaxValue = Math.abs(source[0]);

        for (int value : source) {
            if (absMaxValue < Math.abs(value)) {
                absMaxValue = Math.abs(value);
            }
        }

        if (absMaxValue == 0) {
            return 0;
        }

        int digit = 0;
        while (absMaxValue > 0) {
            digit++;
            absMaxValue /= 10;
        }
        return digit;


    }
}

