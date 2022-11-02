package _03Encapsulation.practice;

public class cart {
    public static void main(String[] args) {
        car c = new car();

        c.setBrand("Ford");

        c.setColor("Gray");

        c.setPrice(39999.99);

        System.out.println("小李的车是:"+c.getBrand());

    }

}
