package algorithm.sort.logarithm;


import algorithm.sort.QuickSort;

import java.util.Arrays;

/**
 * @ClassName QuickSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:01
 * @Version 1.0
 **/
public class QuickSort_Logarithm implements Logarithm {
    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        QuickSort_Logarithm quickSort_logarithm = new QuickSort_Logarithm();
        System.out.println(quickSort_logarithm.work(quickSort::sort));
    }
}
