package _04MethodOverwriting;
/*
1，定义一个方法，求两个参数的最大值

2，定义一个方法，获取数组中的最大值

 */
public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        int max1 = getMax(a,b);
        System.out.println("这两个数中最大值是"+max1);

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int max2 = getArrayMax(arr);
        System.out.println("这组数中最大值是"+max2);
    }

    public static int getMax(int a, int b){
        int max = a>b?a:b;
        return max;
    }

    public static int getArrayMax(int[] arr){
        //1,定义一个变量，保存最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
