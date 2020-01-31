package src.com.assignment.DesignBook.Chapter_2;

class Gear1{

    double chainring,cog;

    public Gear1(double chainring,double cog)
    {
        this.chainring = chainring;
        this.cog = cog;
    }

    public double getRatio()
    {
        return chainring/cog;

    }

}

public class Example1 {

}
