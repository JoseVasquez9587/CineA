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

import umg.progra.proyecto2026.Entity.AnuncioEntity;
import umg.progra.proyecto2026.Repository.AnuncioRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class AnuncioService {
	
	@Autowired
	AnuncioRepository ar;
	
	@GetMapping (path="/buscar")
	public List<AnuncioEntity> buscarAnuncio(){
		
		return ar.findAll();
	}

	@PostMapping (path = "/guardar")
	public AnuncioEntity guardarAnuncio(@RequestBody AnuncioEntity u) {
		
		return ar.save(u);
	}
	
	@DeleteMapping (path = "/eliminar/{idanuncio}")
	public void eliminarAnuncio(@PathVariable("idanuncio") int idAnuncio) {
		
		ar.deleteById(idAnuncio);
		
	}


}
