package src.com.assignment.DesignBook.Chapter_3;

// Isolate Dependency

// instance creation should be highlighted to isolate dependency has exposed dependency


class Gear2 {


    private double chainring,cog,rim,tyre;
    private Wheels wheel;

    public Gear2(double chainring, double cog, double rim, double tyre)
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
        return getRatio()*(wheel.getDiameter());
    }

}


public class Example2 {
}
