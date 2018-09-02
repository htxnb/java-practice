package algorithm.sort;

import algorithm.Utils;
import algorithm.sort.logarithm.SortNoGeneric;


/**
 * 简单选择排序
 * T = O(n^2) 和冒泡排序一样和数据状况无关，没有最优最差算法复杂度
 * @ClassName SelectionSort
 * @Author htx
 * @Date 2018/8/31 10:45
 * @Version 1.0
 **/
public class SelectionSort implements SortNoGeneric {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                min = arr[j] < arr[min] ? j:min;
            }
            Utils.swap(arr,i,min);
        }
    }
}
