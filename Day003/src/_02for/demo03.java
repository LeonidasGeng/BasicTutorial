package _02for;
/*
算1~5的总和
 */
public class demo03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            //每次循环的i都累加在sum中
            sum+=i;
        }
        System.out.println("总和是： "+ sum);
    }
}
