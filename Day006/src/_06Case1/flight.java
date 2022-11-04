package _06Case1;
/*

成员属性：航班号flightNum,航空公司airline,起始点from,终点to，票价fare
成员方法：打印航空信息
 */
public class flight {
    private int flightNum;
    private String airline;
    private String from;
    private String to;
    private double fare;

    public flight(int flightNum, String airline, String from, String to, double fare) {
        this.flightNum = flightNum;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.fare = fare;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public String getAirline() {
        return airline;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getFare() {
        return fare;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void print(){
        System.out.println("小李乘坐的航班号是:"+this.flightNum+", 航空公司为:"+this.airline+", 起始地为:"+this.from+", 目的地为:"+this.to+"票价是:"+this.fare);
    }
}
