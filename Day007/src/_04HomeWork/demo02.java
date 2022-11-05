package _04HomeWork;

import java.util.Random;
import java.util.Scanner;

/*
获取一个包含4个字符的验证码，每一个字符是随机选择的字母和数字，可能包含A-Z,a-z,0-9
用下面字符串随机取出4个字符，拼接验证码

String s = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";

提示用户输入验证码，输入了显示"验证成功",输入错了产生新的验证码，直到用户输入正确

 */
public class demo02 {
    public static void main(String[] args) {
        String s = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";

        //1，用for循环循环4次，得到4个随机的索引值
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //保存验证码
        while(true){
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(s.length()+1);
            //2，根据索引值索取相应的字符
            char ch = s.charAt(index);
            //3，把字符拼接到code字符串中
            code += ch;
        }
        System.out.println("本次验证码："+code);
        //2，接受用户输入的验证码
        System.out.println("请输入你的验证码");
        String inputCode = sc.next();
        if(inputCode.equals(code)){
            System.out.println("验证码输入正确");
            break;
        }else{
            System.out.println("验证码输入错误，请重新输入");
        }}
    }
}
