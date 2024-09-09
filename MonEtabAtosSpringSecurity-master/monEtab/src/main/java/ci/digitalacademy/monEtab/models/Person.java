package ci.digitalacademy.monEtab.models;

import ci.digitalacademy.monEtab.models.enumeration.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

// Classe abstraite Personne
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "person")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate birthday;

    @Column(name = "first_name", nullable = false )
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone_number", unique = true )
    private String phoneNumber;

    @Column(name = "url_picture")
    private String urlPicture;
    @Column(name = "ville")
    private String ville;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne
    private Address address;

    @OneToOne
    private User user;

}
