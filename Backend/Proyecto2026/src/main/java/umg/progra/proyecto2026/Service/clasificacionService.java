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

import umg.progra.proyecto2026.Entity.clasificacionEntity;
import umg.progra.proyecto2026.Repository.clasificacionRepository;

@RestController
@RequestMapping("/clasificacion")
@CrossOrigin
public class clasificacionService {
	
	@Autowired
	clasificacionRepository cr;
	
	@GetMapping (path="/buscar")
	public List<clasificacionEntity> buscarClasificacion(){
		
		return cr.findAll();
	}

	@PostMapping (path = "/guardar")
	public clasificacionEntity guadarClasificacion(@RequestBody clasificacionEntity c) {
		return cr.save(c);
	}
	
	@DeleteMapping (path = "/eliminar/{idclasificacion}")
	public void eliminarClasificacion(@PathVariable("idclasificacion") int idclasificacion_) {
		
		cr.deleteById(idclasificacion_);
		
	}

}
