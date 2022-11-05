package _04HomeWork;

import java.util.Random;

/*
获取一个包含4个字符的验证码，每一个字符是随机选择的字母和数字，可能包含A-Z,a-z,0-9
用下面字符串随机取出4个字符，拼接验证码

String s = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";
 */
public class demo01 {
    public static void main(String[] args) {
        String s = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";

        //1，用for循环循环4次，得到4个随机的索引值
        Random r = new Random();
        //保存验证码
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(s.length()+1);
            //2，根据索引值索取相应的字符
            char ch = s.charAt(index);
            //3，把字符拼接到code字符串中
            code += ch;
        }
        //3，输出验证码
        System.out.println("验证码："+code);


        
    }
}
