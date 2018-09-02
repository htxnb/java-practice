package algorithm.sort;


import algorithm.Utils;
import algorithm.sort.logarithm.SortNoGeneric;


/**
 * 冒泡排序
 * T = O(n^2),与数据状况无关，没有最差，最优情况
 * 是否稳定可以由代码实现，以下代码是稳定的
 * @ClassName BubbleSort
 * @Author htx
 * @Date 2018/8/31 10:44
 * @Version 1.0
 **/
public class BubbleSort implements SortNoGeneric {
    @Override
    public void sort(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    Utils.swap(arr,j,j+1);
                }
            }
        }
    }
}
