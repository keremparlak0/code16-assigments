package cars;

import constants.Constants;

public class Sedan extends Car{
    private int age;
    public Sedan(int luggageCapacity, String color, int age) {
        super(luggageCapacity, color);
        this.age = age;
    }
    // Sedan tip araçlarda yaşa oranla fiyat düşüyor.
    @Override
    public int rentDaily() {
        return Constants.SEDAN_PRICE - (age * 10);
    }

    @Override
    public int rentMonthly() {
        return  (rentDaily()) * 30 ;
    }
}
