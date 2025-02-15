public class RoadBike extends Bicycle {

    private double tireWidth;
    private String handlebarType;

    public RoadBike(double wheelSize, String manufacturer, double frameSize, double gearCount, double tireWidth, String handlebarType) {
        super(wheelSize, manufacturer, frameSize, gearCount);
        this.tireWidth = tireWidth;
        this.handlebarType = handlebarType;
    }

    @Override
    public String toString() {

        return "\nThis is the specification of the road bike: \n\n" +
                "Tire width: " + tireWidth + "\n" +
                "Handlebar type: " + handlebarType + " \n" +
                "Wheel size: " + wheelSize + " mm\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Frame size: " + frameSize + "cm\n" +
                "Gear count: " + gearCount + "\n";


    }
}
