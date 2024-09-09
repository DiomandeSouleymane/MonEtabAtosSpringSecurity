package ci.digitalacademy.monEtab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "teacher")
public class Teacher extends Person {

    @Column(nullable = false)
    private Boolean available;

    @Column(nullable = false)
    private String specialty;

}
