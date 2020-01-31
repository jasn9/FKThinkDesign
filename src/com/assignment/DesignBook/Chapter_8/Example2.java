package src.com.assignment.DesignBook.Chapter_8;

class Bicycle2{
    String size;
    Parts2 parts;

    void spares() {
        if (parts.spares() == true) {
            System.out.println("There is a need of spare object ");
        } else
            System.out.println("There is no need of spare object ");


    }
}




class Parts2 {
    Part2 part;

    boolean spares() {

        return part.need_spare;
    }
}

class Part2{

    String name;
    String description;
    Boolean need_spare = true;

}

public class Example2 {
}
