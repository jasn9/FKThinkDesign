package src.com.assignment.DesignBook.Chapter_6;

import java.util.HashMap;

class Bicycle{

    private double Size;

    public Bicycle(HashMap<String,Double> args)
    {
        Size = args.get("Size");
    }

}

class MountainBike extends Bicycle{

    private double tapeColour;

    public MountainBike(HashMap<String,Double> args)
    {
        super(args);
        tapeColour = args.get("tapeColour");
    }

}

public class Example1 {
}
