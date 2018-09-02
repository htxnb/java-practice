package algorithm.sort;

import algorithm.Utils;
import algorithm.sort.logarithm.Sort;
import algorithm.sort.logarithm.SortNoGeneric;


/**
 * 快速排序
 * @ClassName QuickSort
 * @Author htx
 * @Date 2018/8/31 10:44
 * @Version 1.0
 **/
public class QuickSort implements SortNoGeneric {

    @Override
    public void sort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int left,int right){
       if(left < right){
           int[] patition = patition(arr, left, right);
           quickSort(arr,left,patition[0]);
           quickSort(arr,patition[1],right);
       }
    }

    /**
     * 针对快排修改过的patition()，基于荷兰国旗问题
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int[] patition(int[] arr,int left,int right){
        int value = arr[right];
        int less = left - 1;
        int more = right+1;
        int current = left;
        while(current < more){
            if(arr[current] < value){
                Utils.swap(arr,current++,++less);
            }else if(arr[current] > value){
                Utils.swap(arr,current,--more);
            }else{
                current++;
            }
        }

        return new int[]{less,more};
    }

}
