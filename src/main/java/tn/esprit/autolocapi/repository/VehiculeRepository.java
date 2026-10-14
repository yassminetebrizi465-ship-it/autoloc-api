package tn.esprit.autolocapi.repository;

import org.hibernate.boot.jaxb.mapping.spi.JaxbPersistentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapi.domain.Vehicule;

/*@Repository*/

/*or */
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
}
