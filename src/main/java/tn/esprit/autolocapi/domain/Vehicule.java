package tn.esprit.autolocapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    @Column(nullable = false, unique = true, length = 20)
    private String immatriculation;
    @Column(nullable = false, length = 50)
    private String marque;
    @Column(nullable = false, length = 50)
    private String modele;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private CategorieVehicule categorie;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatutVehicule statut;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "agence_id", nullable = false)
    private Agence agence;

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Maintenance> maintenances = new ArrayList<>();

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Reservation> reservations = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "vehicule_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "equipement_id", nullable = false),
            uniqueConstraints = @UniqueConstraint(columnNames = {"vehicule_id", "equipement_id"})
    )
    @JsonIgnore
    private List<Equipement> equipements = new ArrayList<>();

    public void addMaintenance(Maintenance m) {
        maintenances.add(m);
        m.setVehicule(this);
    }

    public void removeMaintenance(Maintenance m) {
        maintenances.remove(m);
        m.setVehicule(null);
    }

    public void addEquipement(Equipement e) {
        equipements.add(e);
        e.getVehicules().add(this);
    }

    public void removeEquipement(Equipement e) {
        equipements.remove(e);
        e.getVehicules().remove(this);
    }
}
