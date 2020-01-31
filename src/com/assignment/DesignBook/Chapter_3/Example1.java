package src.com.assignment.DesignBook.Chapter_3;

// inject dependencies - means we try to reduce dependency by removing explicit

// hence in Gear1 class decoupling is done by using circles interface in getGearInches method,
// so that Gear1 is not dependent on Wheels but on abstract type

interface Circles{
    public double getDiameter();
}

class Wheels implements  Circles{

    double tyre,rim;

    public Wheels(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

    public double getDiameter()
    {
        return rim+tyre*2;
    }

    public double getCircumference()
    {
        return getDiameter()* Math.PI;
    }

}

class Gear1 {


    private double chainring,cog;

    public void setChainring(double chainring)
    {
        this.chainring = chainring;
    }

    public void setCog(double cog)
    {
        this.cog = cog;
    }


    public double getChainring() { return this.chainring; }
    public double getCog() { return this.cog; }


    public Gear1(double chainring, double cog)
    {
        setChainring(chainring);
        setCog(cog);
    }

    public double getRatio()
    {
        return chainring/cog;
    }

    public double getGearInches(Circles wheel)
    {
        return getRatio()*(wheel.getDiameter());
    }

}


public class Example1 {

}
