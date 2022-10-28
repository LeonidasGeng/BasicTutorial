package _02Opreation;
/*
需求
    int[] arr = {120,130,110,135,125,144,164};
    找出大于等于130的数
 */
public class demo01 {
    public static void main(String[] args) {
        //1,定义一个数组,储存数据
        int[] arr = {120,130,110,135,125,144,164};
        //2,遍历数组,取出数组中每一个元素
        for (int i = 0; i < arr.length; i++) {
        //3,判断当前数据是否大于等于130
            if (arr[i]>=130){
                System.out.println(arr[i]);
            }

        }
    }
}
