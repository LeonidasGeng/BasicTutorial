package _01Methods;
/*
打印两个广告,一个循环3次,一个循环2次

 */
public class demo03practiceAlternative2 {
    public static void main(String[] args) {
        AD(3,"华为手机就是牛"); //实参argument
        AD(2,"Apple今年又拐了");
    }
    /*
    如果我们的代码存在位置参数,那么久把位置的参数定义为形参,比如干一件事（打印广告）,打印几次？打印什么内容？
    形式参数必须有对应的值,否则报错
     */
    public static void AD(int amount, String content){ //形式参数 parameter
        for (int i = 0; i < amount; i++) {
            System.out.println(content);
        }

    }

}
