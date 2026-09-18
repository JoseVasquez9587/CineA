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

import umg.progra.proyecto2026.Entity.RolEntity;
import umg.progra.proyecto2026.Repository.RolRepository;

@RestController
@RequestMapping("/rol")
@CrossOrigin

public class RolService {
	
	@Autowired
	RolRepository rrr;
	
	@GetMapping (path="/buscar")
	public List<RolEntity> buscarRol(){
		
		return rrr.findAll();
	}

	@PostMapping (path = "/guardar")
	public RolEntity guardarRol(@RequestBody RolEntity u) {
		
		return rrr.save(u);
	}
	
	@DeleteMapping (path = "/eliminar/{idrol}")
	public void eliminarRol(@PathVariable("idrol") int idrol_) {
		
		rrr.deleteById(idrol_);
		
	}

}
