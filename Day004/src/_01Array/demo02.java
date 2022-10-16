package _01Array;
/*
目标: 遍历traverse 数组 array
 */
public class demo02 {
    public static void main(String[] args) {
        //1,创建数组
        int[] arr =new int[3]; //索引号 0~2: 0,1,2
        arr[0] = 10;
        arr[1]=11;
        arr[2]=12;

        String[] arr2 = {"张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三","张三"};
        System.out.println(arr2.length);//18个，print出来是12个
        for (int i = 0; i < arr2.length; i++) {       //arr.fori
            System.out.println(arr2[i]);
        }
        //取出所有元素
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);

        }
    }
}
