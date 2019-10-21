package sample;

public class Car extends Vehicle{
    private int int_tirecount;
    public Car(double time, double speed,int tirecount) {
        super(time, speed);
        int_tirecount=tirecount;
    }

    public int getInt_tirecount() {
        return int_tirecount;
    }

    public void setInt_tirecount(int int_tirecount) {
        this.int_tirecount = int_tirecount;
    }
}
