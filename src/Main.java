public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 20000);
        Boat boat = new Boat(125.5, 500);
        car.doVehicleSound();
        car.showVehicleDetails();
        boat.doVehicleSound();
        boat.showVehicleDetails();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}