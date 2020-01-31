package src.com.assignment.DesignBook.Chapter_2;

class obscuringReferences {

    double[][] data;

    public obscuringReferences(double[][] data)
    {
        this.data = data;
    }

    public double[] diameter()
    {
        double[] diameters = new double[data.length];

        for(int i=0;i<data.length;i++)
        {
            diameters[i] = data[i][0]+data[i][1]*2;
        }

        return diameters;
    }

}

public class Example4 {
}
