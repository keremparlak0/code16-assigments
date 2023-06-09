package cars;

import constants.Constants;

public class Hatchback extends Car{
    public Hatchback(int luggageCapacity, String color) {
        super(luggageCapacity, color);
    }

    // Hatchback'lerde bagaj kapasitesine bağlı fiyat artıyor
    @Override
    public int rentDaily() {
        return Constants.HATCHBACK_PRICE + (luggageCapacity / 10);
    }

    @Override
    public int rentMonthly() {
        return rentDaily() * 30;
    }
}
