package sample;

public class Plane extends Vehicle{
    private int int_pilotcount;
    public Plane(double time, double speed,int pilots) {
        super(time, speed);
        int_pilotcount=pilots;
    }

    public int getInt_pilotcount() {
        return int_pilotcount;
    }

    public void setInt_pilotcount(int int_pilotcount) {
        this.int_pilotcount = int_pilotcount;
    }
}
