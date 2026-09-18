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

import umg.progra.proyecto2026.Entity.ReservaEntity;
import umg.progra.proyecto2026.Repository.ReservaRepository;

@RestController
@RequestMapping("/reserva")
@CrossOrigin
public class ReservaService {

	@Autowired
	ReservaRepository rr;

	@GetMapping(path = "/buscar")
	public List<ReservaEntity> buscarReserva() {

		return rr.findAll();
	}

	@PostMapping(path = "/guardar")
	public ReservaEntity guardarReserva(@RequestBody ReservaEntity r) {

		return rr.save(r);
	}

	@DeleteMapping(path = "/eliminar/{idreserva}")
	public void eliminarReserva(@PathVariable("idreserva") int idReserva) {

		rr.deleteById(idReserva);

	}
}