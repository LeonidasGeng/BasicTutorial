package _00Case;
/*
String[] phoneNames = {"华为Mate40RS","华为Mate30E","IPhone12ProMax","华为荣耀麒麟9000","小米10双模5G","OPPOK7x双模5G"};
int[] sales = {8799,8001,9210,9800,10246,10232};

1,定义一个方法,可以找出最高销量,并调用这个方法,获取最高销量
2,定义一个方法,可以找出最高销量的"索引值",并调用这个方法,获取这个索引值；
3,使用这个索引,获取对应的"手机名称",并打印：手机名称：销量 xxxx 部
例如：小米10双模5G：销量 10246 部

//如果一个方法有返回值类型，必须保证任何情况下都有返回值
//如果索引值是-1(return -1),则代表系统没有找到该元素的位置
 */
public class demo02 {
    public static void main(String[] args) {
        String[] phoneNames = {"华为Mate40RS","华为Mate30E","IPhone12ProMax","华为荣耀麒麟9000","小米10双模5G","OPPOK7x双模5G"};
        int[] sales = {8799,8001,9210,9800,10246,10232};
        int maxSales = getTopSales(sales);
        System.out.println("最大销量: "+maxSales);
        int index = getIndex(sales,maxSales);
        System.out.println("本能最高销量的手机是:" + phoneNames[index] + ", "+"销量是："+ maxSales);
    }

    public static int getTopSales(int[] sales){
        //定义一个数组储存最大值，设这个数是数组第一个值
        int max = sales[0];
        //遍历数组，查找最大值
        for (int i = 1; i < sales.length; i++) {
            if (sales[i]>max){
                max = sales[i];
            }
        }return max;
    }

    public static int getIndex(int[] sales, int maxSales){ //sales 数组，maxSales 最高销量
        //遍历这个数组的所有元素，判断哪个元素等于最高销量
        for (int i = 0; i < sales.length; i++) {
            if(sales[i]==maxSales){
                return i;
            }
        }return -1; //如果索引值是-1(return -1),则代表系统没有找到该元素的位置
    }
}
