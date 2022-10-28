package _02MethodsReturnValue;
/*
方法的返回值：
一个方法执行完毕的运算结果

返回方法的调用格式：
    public static 返回值类型 方法名([形式参数]){

    }

返回值注意事项
1,如果返回值的类型是void关键字,代表没有任何返回值,也不能返回
2,返回值的类型代表的是运算结果的数据类型
3,如果一个方法定义了返回值的类型（非void）,任何情况都必须有返回值
4,返回值类型必须与返回值结果类型一致

疑问：
1,什么时候定义返回值类型？什么时候用void？
    如果调用完毕一个方法的时候,你需要使用这个方法的结果进行其他的操作,这时候则需要返回值类型；
    如果一个方法结果不需要再进行其他的操作,则不需要定义返回值


需求：
定义一个方法,求三个整数的最大值

 */
public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 12;
        //调用方法
        //定义一个方法接收运算的结果
        //getMax(a,b);
        int max1 = getMax(a,b);
        int max2 = getMax(max1,c);
        System.out.println("max1= " + max1);
        System.out.println("最终的最大值是："+max2);
        laugh();
    }

    //定义一个方法求出两个参数的最大值
    public static int getMax(int a, int b) {
        int max = a>b?a:b;
        //返回结果
        return max;

    }

    public static String laugh(){
        System.out.println("呵呵");
        return "呵呵";
    }

}
