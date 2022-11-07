package _04StudentManagementManu;

import java.util.ArrayList;
import java.util.Scanner;

/*
1,展示主菜单

 */
public class StudentManager {
    public static void main(String[] args) {
        //主菜单展示
        Scanner sc = new Scanner(System.in);

        //定义一个变量保存当前学生编号id
        int id =0;
        //创建学生集合对象
        ArrayList<Student> Arraylist= new ArrayList<>();
        while (true){
        System.out.println("*****************************************");
        System.out.println("1,添加   2,修改   3,删除   4,查询    5,退出");
        System.out.println("*****************************************");
        //2,接受用户选择
        int option = sc.nextInt();
        switch(option){
            case 1:
                id++;//每添加一个学生，学号+1
                add(sc,id,Arraylist);
                break;
            case 2:
                System.out.println("您选择修改学生信息");
                modify(Arraylist,sc);
                break;
            case 3:
                System.out.println("您选择删除学生信息");
                delete(Arraylist,sc);
                break;
            case 4:
                System.out.println("您选择查询学生信息");
                findAll(Arraylist);
                break;
            case 5:
                System.out.println("您选择退出该系统");
                //退出JVM
                System.exit(0);
            default:
                System.out.println("您输入的有误，请重新输入");
                break;
        }
    }
    }
    //添加学生
    public static void add(Scanner sc,int id,ArrayList<Student> Arraylist ){
        System.out.println("您选择添加学生信息");
        System.out.println("请输入学生姓名: ");
        String name = sc.next();
        System.out.println("请输入学生性别: ");
        String gender = sc.next();
        System.out.println("请输入学生年龄: ");
        int age = sc.nextInt();
        //创建一个学生的对象
        Student s = new Student(id,name,gender,age);
        //把当前的学生对象储存到集合中
        Arraylist.add(s);
        System.out.println("【成功】数据已被保存");
    }

    //查询学生
    public static void findAll(ArrayList<Student> Arraylist){
        //一个tab键占4个空格
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄");
        //遍历集合元素
        for (int i = 0; i < Arraylist.size(); i++) {
            Student s = Arraylist.get(i);
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getGender()+"\t\t"+s.getAge());
        }

    }

    public static void delete(ArrayList<Student> Arraylist, Scanner sc){
        System.out.println("请输入你要删除的学生编号: ");
        int id = sc.nextInt();
        //遍历集合的每一个数学，查看学生的编号，根据用户输入id查找对应的学生，删除
        for (int i = 0; i < Arraylist.size(); i++) {
            //取出每一位学员
            Student s = Arraylist.get(i);
            if(id == s.getId()){
                System.out.println("你要删除的学生的姓名是："+s.getName()+"，你确定要删除吗？(Y/N)");
                String YorN = sc.next();
                if(YorN.equals("Y")){
                    //如果输入id等于学生id，删除
                    Arraylist.remove(i);
                    System.out.println("删除操作已成功！");
                }else {
                    System.out.println("删除操作已取消！");
                }

            }
        }

    }

    //修改学生信息
    public static void modify(ArrayList<Student> Arraylist, Scanner sc) {
        //1,提示用户输入要修改的学生的编号
        System.out.println("请输入您要修改的学员编号: ");
        int id = sc.nextInt();
        //2,遍历集合的每一个元素，根据id去判断
        for (int i = 0; i < Arraylist.size(); i++) {
            Student s = Arraylist.get(i);
            if(s.getId()==id){
                System.out.println("请输入新的姓名: [保留原值请输入0]");
                String name = sc.next();
                System.out.println("请输入新的性别: [保留原值请输入0]");
                String gender = sc.next();
                System.out.println("请输入新的年龄: [保留原值请输入0]");
                int age = sc.nextInt();

                if(!name.equals("0")){
                    s.setName(name);
                }
                if (!gender.equals("0")){
                    s.setGender(gender);
                }
                if (age!=0){
                    s.setAge(age);
                }

                System.out.println("修改成功");
//                //结束循环
//                break;
                //结束方法
                return;


            }
        }

    }
}
