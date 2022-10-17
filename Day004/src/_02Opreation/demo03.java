package _02Opreation;
/*
int[] arr = {120,130,110,135,125,144,164};
找出其中最大值
 */
public class demo03 {
    public static void main(String[] args) {
        int[] arr = {120,130,110,135,125,144,164};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max ){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
