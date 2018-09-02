package algorithm;

import java.util.Arrays;

/**
 * @ClassName Utils
 * @Author htx
 * @Date 2018/9/1 18:16
 * @Version 1.0
 **/
public class Utils {
    /**
     * 数组交换操作，位运算优化交换操作
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i,int j){
        //交换两元素是同意元素，会将此元素置为0
        if(i == j){
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


}
