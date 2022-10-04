package _03DoWhile;
/*
do-while循环语句
格式:
    定义变量
    do{
        循环体语句；
    }while(循环条件语句);
 */
/*
输出1-10的数字
 */
public class demo01 {
    public static void main(String[] args) {
        int i =1;
        //先执行
        do{
            System.out.println(i+", ");
            i++;
        //再判断
        }while(i<=10);
    }
}
