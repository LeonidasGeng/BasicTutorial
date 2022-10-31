package _02this;
/*
现象
在方法中，成员变量与局部变量同名的情况下，java默认就近访问，“就近原则”，访问局部变量

解决这个问题：
this 关键字
    waa

 */
public class demoEmp {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.print();
    }
}
