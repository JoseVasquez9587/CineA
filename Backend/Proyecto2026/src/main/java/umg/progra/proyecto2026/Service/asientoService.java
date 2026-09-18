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

import umg.progra.proyecto2026.Entity.asientoEntity;
import umg.progra.proyecto2026.Repository.asientoRepository;

@RestController
@RequestMapping("/asiento")
@CrossOrigin
public class asientoService {
	
	@Autowired
	asientoRepository ar;
	
	@GetMapping (path = "/buscar")
	public List<asientoEntity> buscarAsiento(){
		
		return ar.findAll();
	}
	
	@PostMapping (path = "/guardar")
	public asientoEntity guardarAsiento(@RequestBody asientoEntity a) {
		return ar.save(a);
	}
	
	@DeleteMapping (path = "/eliminar/{idasiento}")
	public void eliminarAsiento(@PathVariable ("idasiento") int idasiento_) {
		
		ar.deleteById(idasiento_);
	}
	

}
