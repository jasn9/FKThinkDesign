package src.com.assignment.DesignBook.Chapter_3;

// here we isolate vulnerable message
// in getGearInches earlier we have wheel.getDiameter() but it changes suddenly it can break gear inches
// hence it is best to wrap it in diameter() if it changes then only effect will be on wwrap method

class Gear3 {


    private double chainring,cog,rim,tyre;
    private Wheels wheel;

    public Gear3(double chainring, double cog, double rim, double tyre)
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


public class Example3 {

}
