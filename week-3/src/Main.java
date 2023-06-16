import Businnes.TicketManager;
import Data.SeatsData;
import Data.TicketData;
import Models.Ticket;
import Models.enums.Company;
import Models.enums.JourneyType;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                "A2",
                "Kerem PARLAK",
                "12345678901",
                Company.THY,
                JourneyType.ABROAD
        );
        TicketManager manager = new TicketManager(ticket);

    }
}