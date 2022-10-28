package _01while;
/*
工作中尽量减少冗余代码
用循环语句去实现

需求：
输出100次Hello World

解决方案：
使用循环语句去做

循环的作用：反复执行某一段或几段代码）


while循环
格式：
    变量 的定义语句//用于记录循环的次数

    while(循环条件判断语句){

        循环体语句;//符合上述循环条件重复执行的代码

        循环条件控制语句;//每成功执行了一次循环体语句,变量的行为
    }



 */
public class demo01 {
    public static void main(String[] args) {
        int i = 0;//定义一个变量,记录循环次数
        while (i<4){//循环条件,0,1,2,3
            //每次执行完一次循环语句,都会判断一次要不要继续执行
            i += 1;//循环空值语句,每循环一次,i+1
            System.out.println("Hello World!");
        }
        System.out.println(i);
    }
}
