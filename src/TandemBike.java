public class TandemBike extends Bicycle {

    private int numSeats;
    private int numPedals;

    public TandemBike(double wheelSize, String manufacturer, double frameSize, double gearCount, int numSeats, int numPedals) {

        super(wheelSize, manufacturer, frameSize, gearCount);
        this.numSeats = numSeats;
        this.numPedals = numPedals;
    }


    @Override
    public String toString() {

       return "\nThis is the specification of the tandem bike: \n\n" +
                "Number of Seats: " + numSeats + "\n" +
                "Number of Pedals: " + numPedals + " \n" +
                "Wheel Size: " + wheelSize + " mm\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Frame size: " + frameSize + "cm\n" +
                "Gear Count: " + gearCount + "\n";


    }



}
