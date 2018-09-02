package algorithm.sort.logarithm;

import algorithm.sort.BucketSort;

import java.util.Arrays;

/**
 * @ClassName BucketSort_Logarithm
 * @Author htx
 * @Date 2018/9/2 14:36
 * @Version 1.0
 **/
public class BucketSort_Logarithm implements Logarithm{

    @Override
    public void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        BucketSort_Logarithm bucketSort_logarithm = new BucketSort_Logarithm();
        BucketSort bucketSort = new BucketSort();
        System.out.println(bucketSort_logarithm.work(bucketSort::sort));
    }
}
