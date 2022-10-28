package _04MethodOverloading;
/*
1,定义一个方法,求两个参数的最大值

2,定义一个方法,获取数组中的最大值

overloading:
方法名相同,功能不同但相似,参数不同

变量名可以相同

参数数量可以不同
数据类型可以不同
参数位置可以不同

在java中,如果多个方法完成的功能是一样的,方法名可以是一样的
一个方法名可以定义多个方法,一个方法名要让别人知道是干嘛的

方法重载overloading好处是：
1,不用起那么多名字
2,调用方便

 */
public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        int max1 = getMax(a,b);
        System.out.println("这两个数中最大值是"+max1);

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int max2 = getMax(arr);
        System.out.println("这组数中最大值是"+max2);
    }

    public static int getMax(int a, int b){
        int max = a>b?a:b;
        return max;
    }

    public static int getMax(int[] arr){
        //1,定义一个变量,保存最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
