package _01ClassAndObject;

public class demo01phone {

    //一类事务的公共属性使用成员变量去描述
    //品牌名
    String brand;
    //价格
    double price;

    //一类事务的公共行为使用方法描述（注意，这里的方法不能用static去修饰）
    public void call(){
        System.out.println("打电话");//方法内部是可以直接访问成员变量的值
    }
    public void sndMessage(){
        System.out.println("发短信");
    }
}
