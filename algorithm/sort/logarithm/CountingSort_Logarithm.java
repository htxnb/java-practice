package algorithm.sort.logarithm;

import algorithm.sort.CountingSort;

import java.util.Arrays;

/**
 * @ClassName CountingSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:36
 * @Version 1.0
 **/
public class CountingSort_Logarithm implements Logarithm {


    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        CountingSort_Logarithm countingSort_logarithm = new CountingSort_Logarithm();
        CountingSort countingSort = new CountingSort();
        System.out.println(countingSort_logarithm.work(countingSort::sort));
    }
}
