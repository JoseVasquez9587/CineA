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

import umg.progra.proyecto2026.Entity.Genero;
import umg.progra.proyecto2026.Repository.GeneroRepository;

@RestController
@RequestMapping("/genero")
@CrossOrigin
public class GeneroService {
	
	@Autowired
	GeneroRepository gr;
	
	@GetMapping (path="/buscar")
	public List<Genero> buscarGenero(){
		
		return gr.findAll();
	}

	@PostMapping (path = "/guardar")
	public Genero guardarGenero(@RequestBody Genero u) {
		
		return gr.save(u);
	}
	
	@DeleteMapping (path = "/eliminar/{idgenero}")
	public void eliminarGenero(@PathVariable("idgenero") int idgenero_) {
		
		gr.deleteById(idgenero_);
		
	}

}
