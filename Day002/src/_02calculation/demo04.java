package _02calculation;
    /*
    赋值运算符：
    =   +=   -=   *=   /=   %=取余等
     */
public class demo04 {
        public static void main(String[] args) {
            //a = 10, 把10赋值给a这个变量进行存储
            int a = 10;
            //+=
            int b = 1;
            b += 2;//等于 b = b+2;
            System.out.println("b = " + b);

            //注意
            byte b1 = 1;
            //byte类型的数据在运算时会自动变为int类型
            int b2 = b1 +1;
            byte b3 = (byte)(b1+1);
            //赋值运算符中，包含了数据类型转换了，java帮我们做好了，不需要我们做了
            b1 += 1;
            System.out.println("b1 = " + b1);
        }
}
