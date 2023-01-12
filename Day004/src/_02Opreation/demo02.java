package _02Opreation;
/*
需求
    int[] arr = {120,130,110,135,125,144,164};
    把数组的所有元素累加,求总和
 */
public class demo02 {
    public static void main(String[] args) {
        //1,定义一个数组储存指定的数据
        int[] arr = {120,130,110,135,125,144,164};
        //2,定义一个变量保存每次相加的结果
        int sum = 0;
        //3,遍历数组,把每一个元素都加到变量中
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);

    }
}
