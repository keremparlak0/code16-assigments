package Models.planeCompanies;

import Models.Ticket;

public class THY extends Company{
    private final int price = 1000;
    public THY(Ticket ticket) {
        super(ticket);
        System.out.println("Sayın '" + ticket.getName() + "' THY iyi uçuşlar diler.");
        System.out.println("Yolculuk için ödemiş olduğunuz tutar =" + price);
    }

    @Override
    public void provideFoodAndBeverageService() {
        System.out.println("Yemek servisimiz vardır");
    }
}
