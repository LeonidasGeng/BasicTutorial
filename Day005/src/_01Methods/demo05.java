package _01Methods;
/*
数组作为形参

需求：定义一个方法，获取到数组中最大元素，并打印出来
 */
public class demo05 {
    public static void main(String[] args) {
        //数组abc储存该数组的值
        int[] abc ={1,2,3,4,5,6,7};
        //调用方法
        getMax(abc);
        getSum(abc);

    }

    public static void getMax(int[] arr){
        //1，假设索引值为0的元素为最大值，然后与后面所有的元素进行比较
        int max = arr[0];
        //2,遍历数组
        for (int i = 0; i < arr.length; i++) {
            //如果数组中的值比max大，那么max = arr[i]
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("该数组最大值为："+max);
    }

    public static void getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("该数组的总和是: "+sum);
        System.out.println("该数组的总和是: "+sum/(arr.length));
    }

}
