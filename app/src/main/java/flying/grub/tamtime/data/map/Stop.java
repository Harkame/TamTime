package flying.grub.tamtime.data.map;

import org.osmdroid.util.GeoPoint;

import java.util.ArrayList;

import flying.grub.tamtime.data.real_time.Time;

public class Stop {
    private int _id;
    private int cityway_id;
    private int tam_id;
    private StopZone stopZone;
    private Direction direction;
    private GeoPoint localisation;
    private ArrayList<Time> times;

    public Stop(int _id, int cityway_id, int tam_id, StopZone stopZone, Direction direction, GeoPoint localisation) {
        this._id = _id;
        this.cityway_id = cityway_id;
        this.tam_id = tam_id;
        this.stopZone = stopZone;
        this.direction = direction;
        this.localisation = localisation;
        this.times = new ArrayList<>();
    }

    public int get_id() {
        return _id;
    }

    public int getCityway_id() {
        return cityway_id;
    }

    public int getTam_id() {
        return tam_id;
    }

    public GeoPoint getLocalisation(){ return localisation;}

    public Direction getDirection() {
        return direction;
    }

    public StopZone getStopZone() {
        return stopZone;
    }

    public ArrayList<Time> getTimes() {
        while (times.size() < 3) {
            times.add(new Time("-", 0, 0));
        }
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "Stop{" +
                "_id=" + _id +
                ", cityway_id=" + cityway_id +
                ", tam_id=" + tam_id +
                ", stopZone=" + stopZone.getName() +
                ", direction=" + direction.getName() +
                ", times=" + times +
                '}';
    }

}
