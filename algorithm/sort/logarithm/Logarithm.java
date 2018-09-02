package algorithm.sort.logarithm;


import java.util.Arrays;

/**
 * 对数器，用来检验算法的正确性；
 * 通过大样本测试用例，进行对比来验证算法的正确性
 * @ClassName Logarithm
 * @Author htx
 * @Date 2018/8/31 10:57
 * @Version 1.0
 **/
public interface Logarithm<Integer> {
     /**
      * 检验算法的入口
      */
     default boolean work(SortNoGeneric sort){
          int[] compared;
          int[] randomArray;
          for (int i = 0; i < 150000; i++) {
               compared = Logarithm.generateRandomArray(100, 100);
               randomArray = new int[compared.length];
               System.arraycopy(compared,0,randomArray,0,compared.length);
               comparator(compared);
               sort.sort(randomArray);
               if(!Logarithm.equals(randomArray,compared)){
                    System.out.println("错误测试实例:"+ Arrays.toString(compared));
                    return false;
               }
          }
          return true;
     }

     /**
      * 与测试算法对比的算法
      */
     void comparator(int[] arr);
     /**
      * 数组中交换两个数，位运算优化
      * @param array
      * @param i
      * @param j
      */
     static void swap(int[] array,int i,int j){
          array[i] = array[i] ^ array[j];
          array[j] = array[i] ^ array[i];
          array[i] = array[i] ^ array[i];
     }

     /**
      * 随机生成一个大小随机，元素值也随机的数组
      * @param maxSize 数组的最大长度
      * @param maxValue 数组中元素的最大值
      */
     static int[] generateRandomArray(int maxSize,int maxValue){
          int[] arr = new int[(int)(Math.random() * (maxSize + 1)) ];
          for (int i = 0;i<arr.length;i++){
               arr[i] = (int) (Math.random() * (maxValue + 1));
          }
          return arr;
     }

     static boolean equals(int[] arr,int[] compared){
          if(arr == null ||compared == null || arr.length != compared.length){
               return false;
          }
          for (int i = 0; i < arr.length; i++) {
               if(arr[i] != compared[i]){
                    return false;
               }
          }
          return true;
     };




}
