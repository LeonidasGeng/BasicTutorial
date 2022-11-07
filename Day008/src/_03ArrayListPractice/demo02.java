package _03ArrayListPractice;
/*
1,定义学生类，包含以下成员属性
    姓名name，性别gender，年龄age，分数score
要求：私有成员属性，无参，全参的构造方法，get/set 方法

2，定义main()方法，初始化三名学员信息，并储存到ArrayList里面
3，遍历集合，打印每名学员信息
 */
import java.util.ArrayList;

public class demo02 {
    public static void main(String[] args) {
        //1,创建一个集合
        ArrayList<Student> arrayList = new ArrayList<>();
        //2,初始化三位学生对象(已输入)，创建对象需要看类的构造方法
        Student s1= new Student("Geng Li",19,"Male",99.99);
        Student s2= new Student("Jie Hu",19,"Male",99.99);
        Student s3= new Student("Kong Long",19,"Unknow",99.99);
        //把学生的对象存储到集合中
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        //3,遍历集合，打印每位学员的信息
        for (int i = 0; i < arrayList.size(); i++) {
            //根据索引值取出学生
            Student s = arrayList.get(i);
            System.out.println("学生姓名："+s.getName()+" 学生年龄："+s.getAge()+" 学生性别："+s.getAge()+" 学生分数："+s.getScore());
        }
    }
}
