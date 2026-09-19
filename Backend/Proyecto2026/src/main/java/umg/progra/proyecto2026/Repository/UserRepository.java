package umg.progra.proyecto2026.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.progra.proyecto2026.Entity.UserEntity;

@Repository ("usuarioRepository")
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	public List<UserEntity> findByContrasenaAndCorreo (String contrasena,String correo);
	
	public List<UserEntity> findByCorreoAndContrasena(String correo,String contrasena);

}
