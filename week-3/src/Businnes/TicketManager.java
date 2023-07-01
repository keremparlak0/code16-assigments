package Businnes;

import Data.TicketData;
import Models.Ticket;
import Models.enums.*;
import Models.planeCompanies.*;

public class TicketManager {
    THY thy;
    Pegasus pegasus;
    TicketData data;

    public TicketManager(Ticket ticket) {
        ticketControl(ticket);

    }

    private void ticketControl(Ticket ticket) {
        boolean isEconomy = isEconomy(ticket);
        if (seatControl(ticket)) {
            if (ticket.getCompanyType().equals(CompanyType.THY)) {
                thy = new THY(ticket, isEconomy);
                thy.foodAndBeverageService();
            } else {
                pegasus = new Pegasus(ticket, isEconomy);
                if (ticket.getJourneyType().equals(JourneyType.ABROAD)) {
                    pegasus.foodAndBeverageService();
                }
            }
        } else {
            System.out.println("Seçtiğiniz koltuk doludur. Lütfen boş bir koltuk seçiniz.");
        }


    }

    private boolean seatControl(Ticket ticket) {
        data = new TicketData();

        if (ticket.getCompanyType().equals(CompanyType.PEGASUS)) {
            return data.getTicketsPegasus().stream().anyMatch(t -> ticket.getSeatNo().equals(t.getSeatNo()));
        } else {
            return data.getTicketsTHY().stream().anyMatch(t -> ticket.getSeatNo().equals(t.getSeatNo()));
        }

    }

    public boolean isEconomy(Ticket ticket) {
        boolean isEconomy = true;

        for (char i = 'A'; i <= 'C'; i++) {
            for (int j = 1; j <= 3; j++) {
                if (ticket.getSeatNo().equals(i + "" + j)){
                    isEconomy = false;
                }
            }
        }
        return isEconomy;
    }
}
