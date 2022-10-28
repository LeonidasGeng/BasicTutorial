package _06LoopLopps;
/*
循环嵌套：
    一个循环的循环体是另一个循环


 */
public class demo01 {
    public static void main(String[] args) {
        for (int j = 0; j < 2; j++) {
            

        //1,输出3次hello world
        for (int i = 0; i < 3; i++) {
            System.out.println(i+"Hello World");
            //循环体语句,需要重复执行的语句
        }
        }
    }
}
