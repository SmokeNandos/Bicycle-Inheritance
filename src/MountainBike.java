public class MountainBike extends Bicycle {

    private String suspensionType;
    private double tireTreadDepth;

    public MountainBike (double wheelSize, String manufacturer, double frameSize, double gearCount, String suspensionType, double tireTreadDepth) {
        super(wheelSize, manufacturer, frameSize, gearCount);
        this.suspensionType = suspensionType;
        this.tireTreadDepth = tireTreadDepth;

    }


    @Override
    public String toString() {

        return "\nThis is the specification of the mountain bike: \n\n" +
                "Suspension: " + suspensionType + "\n" +
                "Tire Tread Depth: " + tireTreadDepth + "mm\n" +
                "Wheel Size: " + wheelSize + "mm\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Frame Size: " + frameSize + "cm\n" +
                "Gear Count: " + gearCount;


    }




}
