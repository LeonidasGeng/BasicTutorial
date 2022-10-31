package _02this;

public class Emp {
    int age = 18;

    public void print(){
        //局部变量和成员变量同名
        int age = 19;
        System.out.println("小李今年: "+this.age+"岁");
    }
}
