package _01ClassAndObject;
/*
定义一个电影Moive类
    成员属性: 影片名称(moiveName),导演(director), 编剧(script), 主演(starring)
    成员方法：输出电影信息（print）

    定义测试类demo02Moive,储存两部电影信息

 */
public class demo02 {
    public static void main(String[] args) {
        //1.1,使用demo02Moive类创建对象m1
        demo02Moive m1 = new demo02Moive();
        //1.2,给对象赋值
        m1.moiveName = "让子弹飞";
        m1.director = "姜文";
        m1.script = "李哥";
        m1.starring = "周润发";

        //1.3,调用输出方法
        m1.print();

        //2.1 使用demo02Moive类创建对象m2
        demo02Moive m2 = new demo02Moive();
        //2.2,给对象赋值
        m2.moiveName = "独行月球";
        m2.director = "开心麻花";
        m2.script = "李哥";
        m2.starring = "沈腾";

        m2.print();
    }
}
