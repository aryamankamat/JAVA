abstract class Vehicle {
    public void RightIndicator() {
        System.out.println(" Blow the right indicator!!!");
    }

    public void LeftIndicator() {
        System.out.println("Blow the left indicator!!!");
    }

    public void ApplyBreaks() {
        System.out.println("Apply the Breaks!!!");
    }

    abstract public void vehicaleStart();
}

class Honda extends Vehicle {
    @Override
    public void vehicaleStart() {
        System.out.println("Implementing self-start mechanism.....");
    }
}

class Yamaha extends Vehicle {
    @Override
    public void vehicaleStart() {
        System.out.println(" Implementing kick-start mechanism.....");
    }
}

public class Abstract_classes {
    public static void main(String[] args) {

        Honda h1 = new Honda();
        System.out.println("\nHonda's Impementations");
        System.out.println(" ----------------------------- ");
        h1.RightIndicator();
        h1.LeftIndicator();
        h1.ApplyBreaks();
        h1.vehicaleStart();

        Yamaha y1 = new Yamaha();
        System.out.println("\nYamaha's Impementations");
        System.out.println(" ----------------------------- ");
        y1.RightIndicator();
        y1.LeftIndicator();
        y1.ApplyBreaks();
        y1.vehicaleStart();

        Vehicle v1 = new Honda();
        System.out.println("\nHonda's Impementations using Reference variable of Parent class Vehicle");
        System.out.println(" ----------------------------- ");
        v1.RightIndicator();
        v1.LeftIndicator();
        v1.ApplyBreaks();
        v1.vehicaleStart();

        Vehicle v2 = new Yamaha();
        System.out.println("\nYamaha's Impementations using Reference variable of Parent class Vehicle");
        System.out.println(" ----------------------------- ");
        v2.RightIndicator();
        v2.LeftIndicator();
        v2.ApplyBreaks();
        v2.vehicaleStart();

    }
}
