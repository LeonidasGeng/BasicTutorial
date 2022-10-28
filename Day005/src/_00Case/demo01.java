package _00Case;
/*
系统取了10个同学的分数,在以下数组中
int[] score= {98,96,90,89,83,81,78,77,74,66};

请分别定义方法,求出以下几个值
平均分
最高分
最低分

*一个方法只能返回一个值


 */
public class demo01 {
    public static void main(String[] args) {
        int[] score= {98,96,90,89,83,81,78,77,74,66};
        System.out.println("这些学生的平均分为"+getAvg(score));
        System.out.println("这些学生的最高分为"+getMax(score));
        System.out.println("这些学生的最低分为"+getMin(score));
    }

    public static int getAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int avg = sum/arr.length;
        return avg;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max>arr[i]){
                return max;
            }else {
                max = arr[i];
            }
        }return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>min){
                return min;
            }else {
                min = arr[i];
            }
        }return min;
    }

}
