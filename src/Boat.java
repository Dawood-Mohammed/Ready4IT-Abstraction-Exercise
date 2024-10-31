public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int bootKilosWeight;
    public Boat(double maxSpeed, int weight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxSpeed;
        this.bootKilosWeight = weight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Vooooooov");
    }
    public String getBoatWeightAndSpeed(){
        return String.format("The boat's total kilos weight: %d, and maximum knots speed is %f", bootKilosWeight, maxKnotsSpeed);
    }
}
