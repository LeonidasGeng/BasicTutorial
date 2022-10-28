public class Test {
    public static void main(String[] args) {
        //记录公交车的乘客数量
        //1, 定义变量,记录车上乘客的初始值
        int count = 0;
        //2,到了第一站,上去1个人,没有下来人
        count = count + 1;
        //3,到了第二站,上去2个人,下来1个人
        count = count + 2 - 1;
        //4,到了第三站,上去2个人,下来1个人
        count = count + 2 - 1;
        //5,到了第四站,上去1个人,没有下来人
        count = count + 1;
        //6,到了第五站,上去2个人,下来2个人
        count = count + 2 - 2;
        //打印 = 计算最后车上有多少人
        System.out.println(count);
    }
}
