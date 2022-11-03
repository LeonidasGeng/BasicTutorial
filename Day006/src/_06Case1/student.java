package _06Case1;
/*
学生信息：
学号id,姓名name，性别gender，年龄age
成员方法：
打印学生信息print，学习study
 */
public class student {
    //学号id
    private int id;
    //姓名name
    private String name;
    //性别gender
    private String gender;
    //年龄age
    private int age;

    //带参的构造方法
    public student(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //无参的构造方法
    public student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 && age >=120){
            System.out.println("输入年龄有误");
        }else {
        this.age = age;}
    }



    public void print(){
        System.out.println("学生学号是: "+this.id+", 学生姓名是："+this.name+", 学生性别："+this.gender+", 学生年龄："+this.age);
    }

    public void study(){
        System.out.println("Good good study, day day up");
    }
}
