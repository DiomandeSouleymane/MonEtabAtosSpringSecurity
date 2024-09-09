package ci.digitalacademy.monEtab.models;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "address")
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_address;
    private String city;
    private String street;
    private String country;

}