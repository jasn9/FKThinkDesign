package src.com.assignment.DesignBook.Chapter_9;

import junit.framework.*;

import static org.junit.Assert.*;
import org.junit.Test;

class WheelTest{
    public void test(){
        Wheel2 wheel = new Wheel2(26, 2);
        assertEquals(30,wheel.diameter());

    }
}

class Wheel2 {

    double rim;
    double tyre;

    public Wheel2(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

    double diameter()
    {
        return rim + (tyre*2);

    }


}

public class Example2 {
}
