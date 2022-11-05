package _03ArrayListPractice;

import java.util.ArrayList;

/*
自定义一个学生类(姓名，性别，年龄，分数)，ArrayList储存学生的对象，然后把ArrayList传递给一个方法
定义一个方法来接收ArrayList, 然后在方法内部取出前2位的学生，储存到新的及集合中并返回

 */
public class demo01 {
//    public static void main(String[] args) {
//        ArrayList<String> al = new ArrayList<>();
//        al.add("aa");
//        al.add("bb");
//        al.add("cc");
//        al.add("dd");
//        print(al);
//    }
//
//    public static void print(ArrayList<String> al2){
//        for (int i = 0; i < al2.size(); i++) {
//            String item = al2.get(i);
//            System.out.println(item+",");
//        }
//    }
public static void main(String[] args) {
    //1，创建一个ArrayList，要求储存的对象是学生Student
    ArrayList<Student> al = new ArrayList();
    //2，创建三个学生对象
    Student s1 = new Student("Geng Li", 18, "Male", 100.00);
    Student s2 = new Student("Jie Hu", 16, "Female", 101.00);
    Student s3 = new Student("Yi Ning", 14, "Unknow", 100.5);
    //添加元素到集合中
    al.add(s1);
    al.add(s2);
    al.add(s3);

    //3，调用方法，得到新的集合
    ArrayList<Student> newAl = newAl(al);
    //如果直接输出一个集合对象，如果集合里面存储的是String+8种基本数据类型的数据
    //可以直接输出看到内容
    //如果集合存储其他类型的元素，看内容的话需要遍历合计的元素
    for (int i = 0; i < newAl.size(); i++) {
        Student s = newAl.get(i);
        System.out.println("姓名："+s.getName()+"年龄："+s.getAge()+"性别："+s.getGender()+"分数："+s.getScore());
    }
//    System.out.println("新集合的元素是:"+newAl);
}

    //3.目标方法：取出前两位，然后保存到新的集合中返回
    public static ArrayList<Student> newAl(ArrayList<Student> al){
        //1,创建一个新的集合
    ArrayList<Student> newAl = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Student student = al.get(i);
            newAl.add(student);
        }
        return newAl;
    }
}

