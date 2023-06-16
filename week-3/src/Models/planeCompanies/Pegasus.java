package Models.planeCompanies;

import Models.Ticket;

public class Pegasus extends Company {
    public Pegasus(Ticket ticket) {
        super(ticket);
        System.out.println("Sayın '" + ticket.getName() + "' Pegasus iyi uçuşlar diler.");
    }

    @Override
    public void provideFoodAndBeverageService() {
        System.out.println("Yemek servisimiz vardır.");
    }
}
