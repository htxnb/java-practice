package algorithm.sort;

import algorithm.sort.logarithm.SortNoGeneric;

/**
 * 希尔排序
 * @ClassName ShellSort
 * @Author htx
 * @Date 2018/8/31 10:44
 * @Version 1.0
 **/
public class ShellSort implements SortNoGeneric {

    private static int shellStep() {
        return 0;
    }

    @Override
    public void sort(int[] arr) {
        int step = shellStep();
        while(step > 0){

            for (int i = step; i < arr.length; i++) {
                int temp = arr[i];
                int index = i-step;
                while(index>=0 && temp < arr[index]){
                    arr[index+1] = arr[index];
                    index-=step;
                }
                arr[index+step] = temp;
            }

        }
    }
}
