import Businnes.TicketManager;
import Models.Ticket;
import Models.enums.CompanyType;
import Models.enums.JourneyType;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                "A3",
                "Kerem PARLAK",
                "12345678902",
                CompanyType.PEGASUS,
                JourneyType.DOMESTIC
        );
        TicketManager manager = new TicketManager(ticket);
    }
}