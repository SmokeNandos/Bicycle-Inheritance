public class Main {
    public static void main(String[] args) {


        MountainBike mountainBike = new MountainBike(32.2, "Trek", 18.0, 21.0, "Hardtail",  1.2);
        System.out.println(mountainBike);
        System.out.println();

        TandemBike tandemBike = new TandemBike (28.0, "Cannondale", 15, 24, 3, 4);
        System.out.println(tandemBike);
        System.out.println();

        RoadBike roadBike = new RoadBike(28, "Giant", 54, 20, 32, "Aero Bar");
        System.out.println(roadBike);
        System.out.println();

    }
}