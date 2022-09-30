package _08case;

import java.util.Scanner;

/*
超市打折
购买金额大于等于1000，75折
购买金额500（包含）-1000,85折
200（包含）-500，9折
200以下，没有折扣
输出最终付款金额
 */
public class testcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购买金额： ");
        int total = sc.nextInt();
        if(total >= 1000){
            System.out.println("最终付款金额为: "+ (total * 0.75)+"元");
        }else if(total >=500 && total <1000){
            System.out.println("最终付款金额为: "+ (total * 0.85)+"元");
        } else if (total>= 200 && total <500){
            System.out.println("最终付款金额为: "+ (total * 0.95)+"元");
        }else{
            System.out.println("最终付款金额为: "+ total +"元");
        }

    }
}
