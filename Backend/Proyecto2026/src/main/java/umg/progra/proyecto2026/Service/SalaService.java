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

import umg.progra.proyecto2026.Entity.SalaEntity;
import umg.progra.proyecto2026.Repository.SalaRepository;

@RestController
@RequestMapping("/sala")
@CrossOrigin
public class SalaService {

	@Autowired
	SalaRepository sr;

	@GetMapping(path = "/buscar")
	public List<SalaEntity> buscarSala() {

		return sr.findAll();
	}

	@PostMapping(path = "/guardar")
	public SalaEntity guardarSala(@RequestBody SalaEntity s) {

		return sr.save(s);
	}

	@DeleteMapping(path = "/eliminar/{idsala}")
	public void eliminarSala(@PathVariable("idsala") int idSala) {

		sr.deleteById(idSala);

	}
}