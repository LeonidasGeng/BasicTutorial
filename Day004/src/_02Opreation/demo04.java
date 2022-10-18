package _02Opreation;
/*
int[] arr = {120,130,110,135,125,144,164};
找出大于130的数的个数

 */
public class demo04 {
    public static void main(String[] args) {
        //1,定义一个数组储存指定数据
        int[] arr = {120,130,110,135,125,144,164};
        //2, 定义一个变量记录次数
        int count=0;
        //3, 遍历数组的元素，判断大于130的元素，count++;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=130){
                count++;
            }
        }
        System.out.println(count);
    }
}
