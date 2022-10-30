package _01ClassAndObject;

//描述电影类
public class demo02Moive {
    //使用成员变量描述
    String moiveName;
    String director;
    String script;
    String starring;

    //输出电影信息
    public void print(){
        //注意：目前成员方法是可以直接访问成员变量
        System.out.println("影片名称: "+moiveName+" 导演: "+director+" 编剧: "+script+" 主演: "+starring);
    }
}


