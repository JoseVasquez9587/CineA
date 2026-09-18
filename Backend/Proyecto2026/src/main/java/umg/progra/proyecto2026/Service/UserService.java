package umg.progra.proyecto2026.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umg.progra.proyecto2026.Entity.UserEntity;
import umg.progra.proyecto2026.Repository.UserRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UserService {
	
	@Autowired
	UserRepository ur;
	
	@GetMapping (path="/buscar")
	public List<UserEntity> buscarUsuario(){
		
		return ur.findAll();
	}

	@PostMapping (path = "/guardar")
	public UserEntity guardarUsuario(@RequestBody UserEntity u) {
		
		return ur.save(u);
	}
	
	@DeleteMapping (path = "/eliminar/{idusuario}")
	public void eliminarUsuario(@PathVariable("idusuario") int idUser) {
		
		ur.deleteById(idUser);
		
	}
	
	@GetMapping (path = "/buscar/{correo}/{contrasena}")
	public List<UserEntity> buscarEmailAndPassword(
			@PathVariable("correo") String correo_,
			@PathVariable("contrasena") String contrasena_
			) {
		
		return ur.findByCorreoAndContrasena(correo_, contrasena_);		
	}


}
