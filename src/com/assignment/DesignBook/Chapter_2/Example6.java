package src.com.assignment.DesignBook.Chapter_2;

// Have method with single responsibility

// Final code

class Wheels{

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

class Gear6 {


    private double chainring,cog;
    private Wheels wheel;

    public void setChainring(double chainring)
    {
        this.chainring = chainring;
    }

    public void setCog(double cog)
    {
        this.cog = cog;
    }

    public void setWheels(Wheels wheel)
    {
        this.wheel = wheel;
    }

    public double getChainring() { return this.chainring; }
    public double getCog() { return this.cog; }
    public Wheels getWheels(){ return this.wheel; }


    public Gear6(double chainring,double cog,Wheels wheel)
    {
        setChainring(chainring);
        setCog(cog);
        setWheels(wheel);
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

public class Example6 {
}
