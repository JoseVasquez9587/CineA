package umg.progra.proyecto2026.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.progra.proyecto2026.Entity.PeliculaEntity;

@Repository("peliculaRepository")
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Integer> {

}
