package _04Constractor;

public class student {
    private String name;

    private double score;

    //构造方法

    public student (String name, double score){
        this.name = name;
        this.score = score;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setScore(double score) {
//        this.score = score;
//    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
