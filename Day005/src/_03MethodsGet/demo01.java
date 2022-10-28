package _03MethodsGet;
/*
定义一个方法getAvg(),让一个整数数组累加,并返回
定义main()方法,调用getAvg()方法,接收返回值并打印

 */
public class demo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("平均值是： "+getAvg(arr));

        double avgResult = getAvg(arr);
        System.out.println("平均值是： "+avgResult);
    }

    public static void test() {
        System.out.println("呵呵");
    }
    public static double getAvg(int[] arr){
        //1,定义一个变量保存综合
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        //3,求平均值
        double avg = (sum*1.0)/(arr.length);
        //2,返回结果
        return avg;
    }
}
