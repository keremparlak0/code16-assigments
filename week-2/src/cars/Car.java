package cars;

public abstract class Car {
    int luggageCapacity; //bagaj kapasitesi
    public String color;

    public Car(int luggageCapacity, String color) {
        this.luggageCapacity = luggageCapacity;
        this.color = color;
    }

    public abstract int rentDaily();
    public abstract int rentMonthly();
}
