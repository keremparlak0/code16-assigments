package Models;

import Models.enums.CompanyType;
import Models.enums.JourneyType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {
    private String seatNo;
    private String name;
    private String tckn;
    private CompanyType companyType;
    private JourneyType journeyType;
    public Ticket(String seatNo, String name, String tckn, CompanyType companyType, JourneyType journeyType) {
        this.seatNo = seatNo;
        this.name = name;
        this.tckn = tckn;
        this.companyType = companyType;
        this.journeyType = journeyType;
    }
}
