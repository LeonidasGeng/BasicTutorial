package _04MethodOverloading;
/*
1,定义一个方法,返回两个参数的最大值
2,定义一个方法,返回三个参数的最大值
要求：
以重载,overloading的形式出现

 */
public class demo02 {
    public static void main(String[] args) {
        int a =1;
        int b =2;

        int x = 3;
        int y = 4;
        int z =5;

        System.out.println("这两个数中最大值是："+getMax(2,1));
        System.out.println("这三个数中最大值是："+getMax(30,80,50));
    }

    public static int getMax(int a, int b){
        int max1 = a>b?a:b;
        return max1;
    }

    public static int getMax(int x,int y,int z){
        int max = x;
        int max2 = y>z?y:z;
        if(max>max2){
            return max;
        } else{
            return max2;
        }
    }

}
