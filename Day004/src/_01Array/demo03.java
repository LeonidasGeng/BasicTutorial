package _01Array;
/*
practice
 */
public class demo03 {
    public static void main(String[] args) {
        String[] arr1 = {"杨幂","刘恺威","古力娜扎","柳岩","郭德纲"};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        String[] arr2 = {"杨幂","刘恺威","古力娜扎","柳岩","郭德纲"};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+",");
        }
        System.out.println("");
        String[] arr3 = {"男","女","女","女","男"};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        String[] arr4 = {"男","女","女","女","男"};
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]+",");
        }
        Float[] arr5 = {1.65f,1.85f,1.70F,1.68F,1.85F};
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }
        System.out.println("");
        double[] arr6 = {1.65F,1.85f,1.70,1.68,1.85};
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i]+",");
        }
        System.out.println("");
        Float[] arr7 = {1.65f,1.85f,1.70F,1.68F,1.85F};
        for (int i = 0; i < arr7.length; i++) {
            System.out.println(arr7[i]);
        }
    }
}
