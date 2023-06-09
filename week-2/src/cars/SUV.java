package cars;

import constants.Constants;

public class SUV extends Car{
    public SUV(int luggageCapacity, String color) {
        super(luggageCapacity, color);
    }

    @Override
    public int rentDaily() {
        return Constants.SUV_PRICE;
    }

    @Override
    public int rentMonthly() {
        return rentDaily() * 30;
    }
}
