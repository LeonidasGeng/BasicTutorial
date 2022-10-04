package _02for;
/*
for循环输出：
1， 1~5
2， 5~1

System.out.println("Hello World!");     带有换行功能
System.out.print  ("Hello World!");     不带有换行功能
System.out.println();                   空白的一行
 */
public class demo02 {
    public static void main(String[] args) {
        for(int i =1; i<6; i++){
            System.out.println(i);
        }
        System.out.println();
        for(int o =5; o>0; o--){
            System.out.println(o);
        }
    }
}
