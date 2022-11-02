package _04Constractor.demo01;

public class studentDemo {
    public static void main(String[] args) {
        //创建学生对象
        student s = new student();
        s.setName("小李");

        s.setScore(99.99);
        System.out.println("学生姓名: "+s.getName()+", 学生的分数: "+ s.getScore());

    }
}
