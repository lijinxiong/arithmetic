package com.arithmetic.deprecated;

/**
 * Created by lijinxiong on 2020/4/7
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Utils {


    public static void swap(int index1, int index2, int[] source) {

        int tem = source[index1];
        source[index1] = source[index2];
        source[index2] = tem;

    }
}
