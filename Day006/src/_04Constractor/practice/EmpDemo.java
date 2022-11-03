package _04Constractor.practice;
/*
赋值顺序:
18-19-20
 */
public class EmpDemo {
    public static void main(String[] args) {
        Emp e = new Emp(19);
        e.setAge(20);
        System.out.println("学生的年龄:" + e.getAge());
    }
}
