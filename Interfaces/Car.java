public class Car extends Vehicle implements OilChange {
    //can only extend once but can implement multiple times
    public void drive() {
        System.out.println("VROOM");
        //method overriding
    }

    public boolean canOilChange() {
        return true;
        //method overriding
    }

    public boolean canOilChange(String str) {
        return false;
        //method overloading
    }

    public int defaultWheels() {
        return 4;
    }

    public Car (String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public String toString() {
        return make + model + year;
    }
}