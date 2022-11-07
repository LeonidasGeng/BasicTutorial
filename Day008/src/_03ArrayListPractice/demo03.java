package _03ArrayListPractice;
/*
1,定义学生类，包含以下成员属性
    姓名name，性别gender，年龄age，分数score
要求：私有成员属性，无参，全参的构造方法，get/set 方法

2，定义main()方法，通过控制台接收3名学员的信息，并储存到ArrayList里面
3，遍历集合，打印每名学员信息
 */
import java.util.ArrayList;
import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        //1,创建一个集合
        ArrayList<Student> arrayList = new ArrayList<>();
        //2,通过控制台接收3名学员的信息
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入性别：");
            String gender = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入分数：");
            double score = sc.nextDouble();
            //把学生的对象存储到集合中
            Student s = new Student(name,age,gender,score);
            arrayList.add(s);
        }

        //3,遍历集合，打印每位学员的信息
        for (int i = 0; i < arrayList.size(); i++) {
            //根据索引值取出学生
            Student s = arrayList.get(i);
            System.out.println("学生姓名："+s.getName()+" 学生年龄："+s.getAge()+" 学生性别："+s.getAge()+" 学生分数："+s.getScore());
        }
    }
}
