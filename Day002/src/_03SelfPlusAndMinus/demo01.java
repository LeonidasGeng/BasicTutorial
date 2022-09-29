package _03SelfPlusAndMinus;
/*
    ++自增，本质就是+1，操作数=操作数+1
    --自减，本质就是-1，操作数=操作数-1

    类型：
    前自增
        ++操作数
    后自增
        操作数++

    前自减
        --操作数
    后自减
        操作数--
 */
public class demo01 {
    public static void main(String[] args) {
        //情况1，独立运算，如果操作数独立运算的时候，前自增与后自增没区别
        int a = 1;
        //前自增
        //++a; //a = a +1;
        a++;
        System.out.println("a = "+a);

        //++和=混合使用
        int b =2;
        int c1 = ++b;//前自增：先自增，后赋值   b=b+1=2, c=b=2;
        int c2 = b++;//后自增：先赋值，后自增   c=b=1, b=b+1;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);


    }
}
