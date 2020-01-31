package src.com.assignment.DesignBook.Chapter_2;

// Hiding data and use accessor method to access it

class Gear3{

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

    public Gear3(double chainring,double cog)
    {
        setChainring(chainring);
        setCog(cog);
    }

    public double getRatio()
    {
        return chainring/cog;

    }

}


public class Example3 {
}
