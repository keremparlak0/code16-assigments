package Models;

import Models.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    private String seatNo;
    private String name;
    private String tckn;
    private CompanyType companyType;
    private JourneyType journeyType;
}
