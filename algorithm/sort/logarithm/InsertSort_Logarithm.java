package algorithm.sort.logarithm;


import algorithm.sort.InsertSort;

import java.util.Arrays;

/**
 * @ClassName InsertSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:31
 * @Version 1.0
 **/
public class InsertSort_Logarithm implements Logarithm {
    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        InsertSort_Logarithm insertSort_logarithm = new InsertSort_Logarithm();
        InsertSort insertSort = new InsertSort();
        System.out.println(insertSort_logarithm.work(insertSort::sort));
    }
}
