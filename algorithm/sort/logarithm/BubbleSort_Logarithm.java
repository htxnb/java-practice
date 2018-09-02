package algorithm.sort.logarithm;


import algorithm.sort.BubbleSort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:31
 * @Version 1.0
 **/
public class BubbleSort_Logarithm implements Logarithm {


    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        BubbleSort_Logarithm bubbleSort_logarithm = new BubbleSort_Logarithm();
        System.out.println(bubbleSort_logarithm.work(bubbleSort::sort));
    }
}
