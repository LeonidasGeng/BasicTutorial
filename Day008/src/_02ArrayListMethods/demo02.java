package _02ArrayListMethods;

import java.util.ArrayList;

/*
对比：
集合的遍历
数组的遍历
ArrayList的遍历


 */
public class demo02 {
    public static void main(String[] args) {
        ArrayPrint();
        StringPrint();
        ArrayListPrint();
    }
    //目前的方法并不是描述某一类事务的行为的时候，同学们可以添加static
    //如果是描述某一类十五的行为的方法，则不能添加static,比如student
    public static void ArrayListPrint(){
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");//0
        list.add("bbb");//1
        list.add("ccc");//2
        //遍历集合每一个元素，然后输出
        //list.get(索引值)//根据索引值获取合集的元素
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item+",");
        }
    }

    public static void ArrayPrint(){
        int[] arr = {11,22,33,44,55};
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            System.out.print(item+",");
        }
    }

    public static void StringPrint(){
        String s = "HelloWorld";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c+",");
        }
    }
}
