public class Car extends Vehicle{
    int numberOfDoors;
    double carPrice;
    public Car(int wheels, int doors, double price){
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("car's number of doors: "+numberOfDoors);
    }
    @Override
    public void doVehicleSound() {
        System.out.println("Vooooom Voooom");
    }
}
