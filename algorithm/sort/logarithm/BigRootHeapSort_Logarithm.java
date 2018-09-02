package algorithm.sort.logarithm;

import algorithm.sort.BigRootHeapSort;

import java.util.Arrays;

/**
 * @ClassName BigRootHeapSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:39
 * @Version 1.0
 **/
public class BigRootHeapSort_Logarithm implements Logarithm {

    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        BigRootHeapSort_Logarithm bigRootHeapSort_logarithm = new BigRootHeapSort_Logarithm();
        BigRootHeapSort bigRootHeapSort = new BigRootHeapSort();
        System.out.println(bigRootHeapSort_logarithm.work(bigRootHeapSort::sort));
    }
}
