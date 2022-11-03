package _04Constractor;
/*
构造方法的作用：
在创建对象的时候初始化成员变量
构造方法的格式：

    public 方法名(形参列表){

    }
注意事项：
    1，构造方法是没有返回值类型，void也不能写
    2，构造方法的方法名必须与类名一致
    3，构造方法不能使用对象去调用，是你创建对象的时候jvm帮你去调用的
    4，构造方法是可以以方法重载的形式存在多个的，创建对象具体调用那个是看创建对象传递的实参
    5，一个类如果没有显式的编写一个构造方法，那么默认有一个无参的构造方法，
       一个类如被编写了一个构造方法，那么不会给你添加一个午餐的构造方法了
 */
public class studentDemo {
    public static void main(String[] args) {
        //创建学生对象
        student s = new student("小李",99.98);
        student s1 = new student("小李",99.99);
        student s2 = new student("小李",99.99);
//        //使用set方法设置属性值
//        s.setName("小李");
//        s.setScore(99.99);
        //使用get方法输出属性值
        System.out.println("学生姓名: "+s.getName()+", 学生的分数: "+ s.getScore());

    }
}
