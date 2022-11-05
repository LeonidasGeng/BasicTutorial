package _02ArrayListMethods;

import java.util.ArrayList;

/*
构造方法: ArrayList xx = new ArrayList();


 */
public class demo01 {
    public static void main(String[] args) {
        //1, 创建一个ArrayList对象（集合）
//        ArrayList al = new ArrayList();
        //代表该集合的容器只能储存字符串类型的数据
//        ArrayList<String> al = new ArrayList();
        //添加int类型的数据，得写Integer
        ArrayList al = new ArrayList();
        //添加元素
        //可以添加任何类型的数据
        //但一般都是存储一种类型的数据，用<>限制数据类型
        //add：添加到末尾
        al.add(1);
        al.add('A');
        al.add("Ligeng");
        al.add("00");
        al.add(00);
        al.add(true);
        //add:(int index, E element)：在指定位置添加
        al.add(2,'B');

        //删除元素remove
        //指定元素内容去删除，目前指定元素删除仅限于里面的储存的是字符串和八种指定类型的数据
        al.remove("Ligeng");
        al.remove(1);
        al.remove("A");

        //指定索引值的位置去修改元素,set
        al.set(1,"N");

        //查询，get
        //get返回索引值位置的元素
//        String str = al.get(3);
//        System.out.println(str);
        //返回集合元素个数
        int lenght = al.size();
        System.out.println("几个内容个数："+lenght);
        System.out.println(al);


    }
}
