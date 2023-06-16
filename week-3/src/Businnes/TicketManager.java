package Businnes;

import Data.TicketData;
import Models.Ticket;
import Models.enums.Company;
import Models.enums.JourneyType;
import Models.planeCompanies.Pegasus;
import Models.planeCompanies.THY;

public class TicketManager {
    THY thy;
    Pegasus pegasus;
    TicketData data;

    public TicketManager(Ticket ticket) {
        ticketControl(ticket);

    }

    private void ticketControl(Ticket ticket){
        if (seatControl(ticket)){
            if (ticket.getCompany().equals(Company.THY)){
                thy = new THY(ticket);
                thy.provideFoodAndBeverageService();
            }else{
                pegasus = new Pegasus(ticket);
                if (ticket.getJourneyType().equals(JourneyType.ABROAD)){
                    pegasus.provideFoodAndBeverageService();
                }
            }
        }else{
            System.out.println("Seçtiğiniz koltuk doludur. Lütfen boş bir koltuk seçiniz.");
        }


    }

    private boolean seatControl(Ticket ticket){
        data = new TicketData();
        boolean isEmpty;

        if (ticket.getCompany().equals(Company.PEGASUS)){
            isEmpty = data.getTicketsPegasus().stream().anyMatch(t -> ticket.getSeatNo().equals(t.getSeatNo()));
        }else {
            isEmpty = data.getTicketsTHY().stream().anyMatch(t -> ticket.getSeatNo().equals(t.getSeatNo()));
        }

        return !isEmpty;
    }
}
