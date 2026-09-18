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

import umg.progra.proyecto2026.Repository.clienteRepository;
import umg.progra.proyecto2026.Entity.clienteEntity;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class clienteService {

	@Autowired
	clienteRepository cr;
	
	@GetMapping (path = "/buscar")
	public List<clienteEntity> buscarCliente(){
		return cr.findAll();
		
	}
	
	@PostMapping (path = "/guardar")
	public clienteEntity guardarCliente(@RequestBody clienteEntity ce) {
		return cr.save(ce);
	}
	
	@DeleteMapping (path = "eliminar/{idcliente}")
	public void eliminarCliente (@PathVariable ("idcliente") int idcliente_) {
		cr.deleteById(idcliente_);
	}
	
	
}
