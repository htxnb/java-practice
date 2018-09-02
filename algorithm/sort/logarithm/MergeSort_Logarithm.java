package algorithm.sort.logarithm;

import algorithm.sort.MergeSort;

import java.util.Arrays;

/**
 * @ClassName MergeSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:36
 * @Version 1.0
 **/
public class MergeSort_Logarithm implements Logarithm {


    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        MergeSort_Logarithm mergeSort_logarithm = new MergeSort_Logarithm();
        MergeSort mergeSort = new MergeSort();
        System.out.println(mergeSort_logarithm.work(mergeSort::sort));
    }
}
