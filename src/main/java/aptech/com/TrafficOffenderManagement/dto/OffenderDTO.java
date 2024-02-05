package aptech.com.TrafficOffenderManagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OffenderDTO {
    private String firstname;
    private String lastname;
    private int offenceNo;
    private String offence;
    private String gender;
}
