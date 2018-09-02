package algorithm.sort;

import algorithm.sort.logarithm.SortNoGeneric;

import java.util.Arrays;

/**
 * 归并排序
 * @ClassName MergeSort
 * @Author htx
 * @Date 2018/8/31 10:45
 * @Version 1.0
 **/
public class MergeSort implements SortNoGeneric {
    @Override
    public void sort(int[] arr) {
        sort(arr,0,arr.length-1);
    }

    private void sort(int[] arr,int left,int right){
        if(left >= right){
           return;
        }
        int mid = left + ((right - left) >> 1);
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid+1,right);

    }

    /**
     * 合并两块已经排序过的数组元素
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    private void merge(int[] arr,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i = left,j = mid,current = 0;
        while(i < mid && j <=right){
            if(arr[i] <= arr[j]){
                temp[current++] = arr[i++];
            }else{
                temp[current++] = arr[j++];
            }
        }

        while(i < mid){
            temp[current++] = arr[i++];
        }
        while(j <= right){
            temp[current++] = arr[j++];
        }
        //复用这个指针
        current = 0;
        for (int k = left; k <= right; k++) {
            arr[k] = temp[current++];
        }

    }


}
