package algorithm.sort.logarithm;

import algorithm.sort.RadixSort;

import java.util.Arrays;

/**
 * @ClassName RadixSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:37
 * @Version 1.0
 **/
public class RadixSort_Logarithm implements Logarithm {


    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        RadixSort_Logarithm radixSort_logarithm = new RadixSort_Logarithm();
        RadixSort radixSort = new RadixSort();
        System.out.println(radixSort_logarithm.work(radixSort::sort));
    }
}
