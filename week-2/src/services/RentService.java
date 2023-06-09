package services;

import cars.*;
import customers.*;

public class RentService {
    // Overloading kullanarak Bireysel hesapların sadece hatchback araç fiyatı sorabileceği bir yapı kurdum
    public RentService(Company company, Car car, String rentChoice) {
        if (rentChoice.equals("gunluk")) {
            System.out.println(car.color + " renkli " + car.getClass().getName() +" aracın günlük kiralama ücreti = " + car.rentDaily() + "₺");
        }else {
            System.out.println(car.color + " renkli " + car.getClass().getName() +" aracın aylık kiralama ücreti = " + car.rentMonthly() + "₺");;
        }
    }

    public RentService(Person person, Hatchback hatchback, String rentChoice) {
        if (rentChoice.equals("gunluk")) {
            System.out.println(hatchback.color + " renkli " + hatchback.getClass().getName() +" aracın günlük kiralama ücreti = " + hatchback.rentDaily() + "₺");;
        }else {
            System.out.println(hatchback.color + " renkli " + hatchback.getClass().getName() +" aracın aylık kiralama ücreti = " + hatchback.rentMonthly() + "₺");;
        }
    }

}
