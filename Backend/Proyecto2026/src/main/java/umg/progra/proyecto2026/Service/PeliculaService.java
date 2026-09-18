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

import umg.progra.proyecto2026.Entity.PeliculaEntity;
import umg.progra.proyecto2026.Repository.PeliculaRepository;

@RestController
@RequestMapping("/pelicula")
@CrossOrigin
public class PeliculaService {
	
	@Autowired
	PeliculaRepository ar;
	
	@GetMapping (path="/buscar")
	public List<PeliculaEntity> buscarPelicula(){
		
		return ar.findAll();
	}

	@PostMapping (path = "/guardar")
	public PeliculaEntity guardarPelicula(@RequestBody PeliculaEntity u) {
		
		return ar.save(u);
	}
	
	@DeleteMapping (path = "/eliminar/{idpelicula}")
	public void eliminarPelicula(@PathVariable("idpelicula") int idpelicula_) {
		
		ar.deleteById(idpelicula_);
		
	}

}
