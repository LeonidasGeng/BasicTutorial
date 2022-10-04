package _02for;
/*
判断0~10中，一个数是奇数还是偶数
 奇数：
 x%2!=0;
 偶数：
 x%2==0;
 */
public class demo04 {
    public static void main(String[] args) {
        //编写一个循环是从0~10
        for (int i = 0; i < 11; i++) {
            if(i%2==0){
                //为偶数
                System.out.println("数字 "+i+" 为偶数");
            }else{
                System.out.println("数字 "+i+" 为奇数");
            }

        }
    }
}
