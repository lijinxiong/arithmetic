package com.arithmetic.deprecated.one;

/**
 * Created by lijinxiong on 2019/11/12
 * <p>
 * 二分查找
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Bsearch {


    public int bsearch(int[] array, int low, int high, int target) {

        // 递归出口
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (target < array[mid]) {

            high = mid - 1;
            return bsearch(array, low, high, target);

        } else if (target > array[mid]) {

            low = mid + 1;
            return bsearch(array, low, high, target);

        } else {

            return mid;

        }


    }

}

