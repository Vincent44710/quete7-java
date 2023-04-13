public class Hangar {
    public static void main(String[] args) {
        Car car1 = new Car("toyota", 51000);
        Boat boat1 = new Boat("yamaha", 20000);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());

    }

}
