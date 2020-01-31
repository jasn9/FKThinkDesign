package src.com.assignment.DesignBook.Chapter_6;

import java.util.HashMap;

class Bicycle2 {

    double size,chain,tyre_size;

    public Bicycle2(HashMap<String,Double> args)
    {
        this.size = args.get("size");
        this.chain = args.get("chain");
        this.tyre_size = args.get("tyre_size");
        post_initialize(args);
    }

    public void post_initialize(HashMap<String,Double> args)
    {

    }

    public void local_spares()
    {

    }

    public Double default_chain()
    {
        return 12.0;
    }

    public double default_tyre_size()
    {
        return 0.0;
    }

}

class RoadBike extends Bicycle2{

    double tape_color;

    public RoadBike(HashMap<String,Double> args)
    {
        super(args);
        post_initialize(args);
    }

    public void post_initialize(HashMap<String,Double> args)
    {
        tape_color = args.get("tape_color");
    }

    public double default_tyre_size()
    {
        return 10.0;
    }

}

class MountainBike extends Bicycle2
{

    double front_shock,rear_shock;

    public MountainBike(HashMap<String,Double> args)
    {
        super(args);
        post_initialize(args);
    }

    public void post_initialize(HashMap<String,Double> args)
    {
        this.front_shock = args.get("front_shock");
        this.rear_shock = args.get("rear_schock");
    }

    public double default_tyre_size()
    {
        return 1.0;
    }

}

public class Example2 {
}
