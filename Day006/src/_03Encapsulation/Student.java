package _03Encapsulation;

public class Student {
    String stuName;
    private int stuAge;

    //设置：公共的setter方法
    public void setStuAge(int a) {
        if (a > 0 && a <= 120) {
            stuAge = a;
        } else {
            System.out.println("您的年龄异常");
        }

    }

    //访问：公共的getter方法
    public int getStuAge() {
        return stuAge;
    }

    //这个方法在Student类中
    public void print() {
        System.out.println("学生姓名: " + stuName + " 学生年龄: " + stuAge);
    }
}
