package _03Case;
/*
判断一串数字,
第一位和最后一位相等？
1,定义两个变量,对比元素的索引值
startIndex = 0;
endIndex = arr.length-1;
2,每对比完一次
startIndex++;
endIndex--;
3,循环对比条件
startIndex < endIndex;

 */
public class _04Case3 {
    public static void main(String[] args) {
        //1,定义一个数组,并且存储数据
        int[] arr = {1,2,3,2,1};
        //2, 定义两个变量记录要对比元素的索引值
        int startIndex = 0;
        int endIndex = arr.length-1;

        boolean flag = true;//默认破解成功
        //3,循环对比两个数是否一致
        while (startIndex<endIndex){
            if(arr[startIndex] != arr[endIndex]){
                flag = false;
                //结束循环
                break;
            }
            //每对比完一次,开始索引值都应该+1,结束索引值都应该-1
            startIndex++;
            endIndex--;
        }
        System.out.println("是否破解成功？"+flag);
    
    }
}
