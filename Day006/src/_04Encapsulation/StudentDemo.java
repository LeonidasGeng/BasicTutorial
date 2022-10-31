package _04Encapsulation;
/*
问题：数据不安全，赋值不合理的数据

根本原因：可以直接访问属性数据（可以直接访问成员变量）

解决方案：封装

private:
1, private是权限修饰符，可以修饰成员变量，可以修饰成员方法，不能修饰局部变量
2, 代表的是私有的，修饰的内容只能在本类进行访问，public代表的是公共的，所有人都能直接访问

封装步骤（固定的）：
    1,private 修饰成员变量
    2,提供一个公共的Getter方法与Setter方法去获取与设置私有的成员变量


 */
public class StudentDemo {
    public static void main(String[] args) {
        //1, 创建一个学生对象
        Student s = new Student();
        //2, 给学生的属性赋值
        s.stuName= "小李";
        s.setStuAge(19);
        //访问学生的属性
        System.out.println("学生姓名: "+s.stuName+" 学生年龄: "+s.getStuAge());
        s.print();
    }



}
