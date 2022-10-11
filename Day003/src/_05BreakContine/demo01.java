package _05BreakContine;
/*
☆continue
    先执行本次循环，但结果不输出，然后结束/跳过本次循环，继续下一个循环

☆break
    1，在switch语句中的作用就是结束switch语句
    2，在循环中，基于控制条件，终止循环体的内容的执行--->结束当前整个循环
 */
/*
public class demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if(i ==1){
                continue;
            }
            System.out.println(i);//0,1,2
            //条件: 遇到1，不输出
        }
    }
}

 */
//test, output:1,2,4,5,7,8,10, 跳过3，6，9
public class demo01 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i%3 ==0) {//3的倍数
                continue;
            }
            System.out.println(i);
        }
    }
}