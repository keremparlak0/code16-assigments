package Models.planeCompanies;

import Models.Ticket;

public abstract class Company {
    private Ticket ticket;
    private int price;
    public Company(Ticket ticket) {
        this.ticket = ticket;
    }

    abstract void foodAndBeverageService();
}
