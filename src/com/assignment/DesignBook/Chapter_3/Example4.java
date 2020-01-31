package src.com.assignment.DesignBook.Chapter_3;

import java.util.HashMap;

// Use HashMap so that module doesn't get affected when order of argument changes
// Also if argument order is fixed use your own module which takes hashmap as argument which in turn pass message to fix argument order module

class Gear4 {


    private double chainring,cog,rim,tyre;
    private Wheels wheel;

    public Gear4(double chainring, double cog, double rim, double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
        wheel = new Wheels(rim,tyre);
    }

    public double getRatio()
    {
        return chainring/cog;
    }

    public double getGearInches()
    {
        return getRatio()*diameter();
    }

    public double diameter()
    {
        return wheel.getDiameter();
    }

}


public class Example4
{

    public Example4(HashMap<String,Double> args)
    {
        Gear4 obj = new Gear4(args.get("chainring"),args.get("cog"),args.get("rim"),args.get("tyre"));
    }

}
