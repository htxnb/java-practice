package algorithm.sort;


import algorithm.sort.logarithm.SortNoGeneric;


/**
 * 直接插入排序
 * 与数据状况有关，数据接近有序时，最优时间复杂度为T = O(n)；
 * 数据接近倒序时，最差时间复杂度为T = O(n^2)
 * @ClassName InsertSort
 * @Author htx
 * @Date 2018/8/31 10:44
 * @Version 1.0
 **/
public class InsertSort implements SortNoGeneric {


    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i-1;
            while(index >= 0 && temp < arr[index] ){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = temp;
        }
    }
}
