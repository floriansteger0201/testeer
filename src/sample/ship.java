package sample;

public class ship extends Vehicle {
    private int ankercount;
    public ship(double time, double speed,int ankers) {
        super(time, speed);
        ankercount=ankers;
    }

    public int getAnkercount() {
        return ankercount;
    }

    public void setAnkercount(int ankercount) {
        this.ankercount = ankercount;
    }
}
