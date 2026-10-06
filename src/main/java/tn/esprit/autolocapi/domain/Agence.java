package tn.esprit.autolocapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    @Column(nullable = false, length = 100)
    private String nom;
    @Column(nullable = false, length = 50)
    private String ville;
    @Column(nullable = false, length = 150)
    private String adresse;
    @Column(nullable = false, length = 20)
    private String telephone;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    private List<Employe> employes = new ArrayList<>();

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    private List<Vehicule> vehicules = new ArrayList<>();

    public void addEmploye(Employe e) {
        employes.add(e);
        e.setAgence(this);
    }

    public void addVehicule(Vehicule v) {
        vehicules.add(v);
        v.setAgence(this);
    }

}
