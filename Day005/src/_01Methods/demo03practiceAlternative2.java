package _01Methods;
/*
打印两个广告，一个循环3次，一个循环2次

 */
public class demo03practiceAlternative2 {
    public static void main(String[] args) {
        AD(3,"华为手机就是牛");
        AD(2,"Apple今年又拐了");
    }

    public static void AD(int amount, String content){
        for (int i = 0; i < amount; i++) {
            System.out.println(content);
        }

    }

}
