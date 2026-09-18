package umg.progra.proyecto2026.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.progra.proyecto2026.Entity.Genero;

@Repository("generoRepository")
public interface GeneroRepository extends JpaRepository<Genero, Integer>{

}
