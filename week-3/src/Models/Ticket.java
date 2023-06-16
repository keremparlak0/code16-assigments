package Models;

import Models.enums.Company;
import Models.enums.JourneyType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {
    private String seatNo;
    private String name;
    private String tckn;
    private Company company;
    private JourneyType journeyType;
    public Ticket(String seatNo, String name, String tckn, Company company, JourneyType journeyType) {
        this.seatNo = seatNo;
        this.name = name;
        this.tckn = tckn;
        this.company = company;
        this.journeyType = journeyType;
    }
}
