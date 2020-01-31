package src.com.assignment.DesignBook.Chapter_2;

class Gear2{

    double chainring,cog,rim,tyre;

    public Gear2(double chainring,double cog,double rim,double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
    }

    public double getRatio()
    {
        return chainring/cog;
    }

    public double getGearInches()
    {
        return getRatio()*(rim+tyre*2);
    }

}


public class Example2 {
}
