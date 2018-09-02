package algorithm;

import java.util.Arrays;

/**
 * 荷兰国旗问题
 * 提供一个基准值，对数组进行排序，等于这个基准值的数放在中间，小于的放左边，大于的放右边,结果无序
 * @ClassName Holland
 * @Author htx
 * @Date 2018/9/1 22:51
 * @Version 1.0
 **/
public class Holland {
    public static void patition(int[] arr,int value){
        int less = -1,more = arr.length;
        int index = 0;
        while(index < more){
            if(arr[index] > value){
                Utils.swap(arr,index,more-1);
                more--;
            }else if(arr[index] < value){
                Utils.swap(arr,less+1,index++);
                less++;
            }else{
                index++;
            }
        }
    }

}
