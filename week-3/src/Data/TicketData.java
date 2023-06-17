package Data;

import Models.enums.CompanyType;
import Models.enums.JourneyType;
import Models.Ticket;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class TicketData {
    ArrayList<Ticket> ticketsTHY, ticketsPegasus;

    public TicketData() {
        ticketsTHY = new ArrayList<Ticket>();
        ticketsPegasus = new ArrayList<Ticket>();

        ticketsTHY.add(new Ticket(
                "A2",
                "Ahmet YILMAZ",
                "12345678901",
                CompanyType.THY,
                JourneyType.DOMESTIC));
        ticketsPegasus.add(new Ticket(
                "B2",
                "Ayşe DEMİR",
                "23456789012",
                CompanyType.PEGASUS,
                JourneyType.ABROAD));
        ticketsTHY.add(new Ticket(
                "C3",
                "Mehmet ÖZTÜRK",
                "34567890123",
                CompanyType.THY,
                JourneyType.DOMESTIC));
    }

}
