package _06Case1;

public class StudentDemo {
    public static void main(String[] args) {
        student s = new student(33,"小李","男",18);
//        student s1 = new student();
//        s.setId(34);
//        s.setName("小李");
//        s.setGender("男");
//        s.setAge(19);
        s.print();
        s.study();
    }
}
