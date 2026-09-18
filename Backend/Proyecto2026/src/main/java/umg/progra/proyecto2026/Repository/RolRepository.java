package umg.progra.proyecto2026.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.progra.proyecto2026.Entity.RolEntity;

@Repository ("rolRepository")
public interface RolRepository extends JpaRepository<RolEntity, Integer>{
	
	

}
