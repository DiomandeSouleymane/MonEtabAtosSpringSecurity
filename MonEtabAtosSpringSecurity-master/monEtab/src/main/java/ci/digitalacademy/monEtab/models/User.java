package ci.digitalacademy.monEtab.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    @Column(name = "pseudo" , unique = true , nullable = false)
    private String pseudo;

    @Column(name = "password" , nullable = false)
    private String password;

    @Column(name = "creation_date" , nullable = false)
    private Instant createdDate;

    @OneToMany(fetch = FetchType.EAGER)
    private List<RoleUser> roleUser;

    @ManyToOne
    @JoinColumn(name = "id_school")
    private School school;
}
