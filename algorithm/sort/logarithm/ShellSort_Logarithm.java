package algorithm.sort.logarithm;


import algorithm.sort.ShellSort;

import java.util.Arrays;

/**
 * @ClassName ShellSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:31
 * @Version 1.0
 **/
public class ShellSort_Logarithm implements Logarithm {


    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        ShellSort_Logarithm shellSort_logarithm = new ShellSort_Logarithm();
        ShellSort shellSort = new ShellSort();
        System.out.println(shellSort_logarithm.work(shellSort::sort));
    }
}
