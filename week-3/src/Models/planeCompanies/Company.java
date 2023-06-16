package Models.planeCompanies;

import Models.Ticket;

public abstract class Company {
    private Ticket ticket;
    public Company(Ticket ticket) {
        this.ticket = ticket;
    }

    abstract void provideFoodAndBeverageService();
}
