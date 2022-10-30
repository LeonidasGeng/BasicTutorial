package _01ClassAndObject;
/*
class:
同一类事务公共的属性与行为的抽象
大概念：运动

object:
具体的某一个事务
小概念：蓝球

格式：
    public class 类名{

        该类事务的公共属性使用成员变量去描述
        变量：衣服有：品牌，价格

        该类事务的公共行为使用成员方法去描述
        方法：穿，脱，披

    }

通过内创建对象的格式:
    类名 变量名 = new 类名();

访问对象的属性：
    变量名，属性名
给对象赋予属性值：
    变量名，属性名 = 属性值;

调用对象的方法
    变量名，方法名();

 */
public class demo01 {
    public static void main(String[] args) {
        //1,创建一个手机对象
        demo01phone p = new demo01phone();
        //给对象的属性赋值
        p.brand = "Iphone 14 Pro Max Plus";
        p.price = 899.99;
        //访问对象的属性
        System.out.println("品牌"+p.brand+" 价格"+p.price);

        //调用对象的方法
        p.call();
    }
}
