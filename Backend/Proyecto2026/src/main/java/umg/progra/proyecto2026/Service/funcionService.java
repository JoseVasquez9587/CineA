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

import umg.progra.proyecto2026.Entity.funcion;
import umg.progra.proyecto2026.Repository.funcionRepository;

@RestController
@RequestMapping("/funcion")
@CrossOrigin
public class funcionService {
	
	@Autowired
	funcionRepository fr;
	
	@GetMapping (path="/buscar")
	public List<funcion> buscarFuncion(){
		
		return fr.findAll();
	}

	@PostMapping (path = "/guardar")
	public funcion guardarFuncion(@RequestBody funcion u) {
		
		return fr.save(u);
	}
	
	@DeleteMapping (path = "/eliminar/{idfuncion}")
	public void eliminarFuncion(@PathVariable("idfuncion") int idfuncion_) {
		
		fr.deleteById(idfuncion_);
		
	}

}
