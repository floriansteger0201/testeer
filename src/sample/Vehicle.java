package sample;


public abstract class  Vehicle implements IVehicle{
    private double db_average_drive;
    private double Db_average_speed;

    public Vehicle(double time,double speed) {
        db_average_drive=time;
        Db_average_speed= speed;
    }

    public double getDb_average_drive() {
        return db_average_drive;
    }

    public double getDb_average_speed() {
        return Db_average_speed;
    }

    public void setDb_average_drive(double db_average_drive) {
        this.db_average_drive = db_average_drive;
    }

    public void setDb_average_speed(double db_average_speed) {
        Db_average_speed = db_average_speed;
    }

    public boolean drive(double drivetime) {
        return true;
    }

    public boolean anhalten() {
        return false;
    }
}
