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

import umg.progra.proyecto2026.Entity.detalleReserva;
import umg.progra.proyecto2026.Repository.detailReservRepository;

@RestController
@RequestMapping("/detalleReserva")
@CrossOrigin
public class detailReservService {
	
	@Autowired
	detailReservRepository dr;
	
	@GetMapping (path="/buscar")
	public List<detalleReserva> buscarDetalleReserva(){
		
		return dr.findAll();
	}

	@PostMapping (path = "/guardar")
	public detalleReserva guardarDetalleReserva(@RequestBody detalleReserva u) {
		
		return dr.save(u);
	}
	
	@DeleteMapping (path = "/eliminar/{idreserva}")
	public void eliminarDetalleReserva(@PathVariable("idreserva") int idreserva_) {
		
		dr.deleteById(idreserva_);
		
	}

}
