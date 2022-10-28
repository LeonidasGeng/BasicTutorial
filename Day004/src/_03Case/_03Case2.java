package _03Case;

import java.util.Random;

/*
双色球,6个红球,1个蓝球
1,6个红球,1-33之间
2,1个蓝球,1-16之间
3,暂时不考虑重复,排序问题
 */
public class _03Case2 {
    public static void main(String[] args) {
        int[] redArray = new int[6];
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int redNum = r.nextInt(33)+1;
            redArray[i] = redNum;

        }
        int blueNum = r.nextInt(16)+1;

        System.out.println("本期开奖号码为：");
        for (int i = 0; i < redArray.length; i++) {
            System.out.print(redArray[i]+",");
        }
        System.out.print(blueNum);
    }
}
