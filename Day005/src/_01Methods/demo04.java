package _01Methods;
/*
1:
定义一个方法,getMax,可以求出两个整数的最大值（未知参数）,并打印结果

2:
定义一个方法,printStudent,可以打印一个学生的姓名,性别,年龄
 */
public class demo04 {
    public static void main(String[] args) {
        gertMax(3,9);
        printStudent("小李","男",29);
    }

    public static void gertMax(int a,int b){
        //求出两个变量的最大值
        int max = a>b?a:b;
        System.out.println("最大值是："+max);
    }
    public static void printStudent(String name,String gender,int age){
        System.out.println("姓名："+ name + " 性别："+ gender+" 年龄："+age );
    }
}
