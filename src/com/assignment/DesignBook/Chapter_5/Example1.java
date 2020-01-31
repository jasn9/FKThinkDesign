package src.com.assignment.DesignBook.Chapter_5;

// Duck typing in java.

interface Preparer{

    void prepare_trip(Trip trip);

}

class Trip {

    private int bicycle,customer, verhicle;

    public void prepares(Preparer preparer)
    {
        preparer.prepare_trip(this);
    }

}

class Mechanic
{
    public void prepare_trip(Trip trip)
    {
        System.out.println("Mechanic");
    }
}

class TripAdviser
{
    public void prepare_trip(Trip trip)
    {
        System.out.println("Trip Adviser");
    }
}



public class Example1 {
}
