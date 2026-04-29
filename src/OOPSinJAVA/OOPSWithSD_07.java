package OOPSinJAVA;
// Interface :-

interface Mobile{
    int button = 3;
    public void network();
}

interface Device{

}

class Smartphone implements Mobile, Device {
    public void network() {
        System.out.println("Smartphone works on 5G network");
    }
}
public class OOPSWithSD_07 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.network();
    }
}

/*
 Interfaces:-

. All the fields in interfaces are public, static and final by default.
. All methods are public & abstract by default.
. A class that implements an interface must implement all the methods declared in the interface.
. Interfaces support the functionality of multiple inheritance.

 */