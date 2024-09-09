package ci.digitalacademy.monEtab.services.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class AbsenceDTO {
    private Long id_absence;
    private Date absenceDate;
    private Long absenceNumber;
    private StudentDTO student;
}
