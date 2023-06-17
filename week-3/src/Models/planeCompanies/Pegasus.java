package Models.planeCompanies;

import Businnes.TicketManager;
import Models.Ticket;

public class Pegasus extends Company {
    private final int price = 1200;

    public Pegasus(Ticket ticket, boolean isEconomy) {
        super(ticket);
        System.out.println("Sayın '" + ticket.getName() + "' Pegasus iyi uçuşlar diler.");
        System.out.println("Yolculuk için ödemiş olduğunuz tutar = " + getPrice(isEconomy) + "₺");
    }

    @Override
    public void foodAndBeverageService() {
        System.out.println("Yiyecek ve içecek servisimiz vardır.");
    }

    public int getPrice(boolean isEconomy) {
        if (isEconomy) {
            return price;
        } else {
            return price * 2;
        }
    }
}
