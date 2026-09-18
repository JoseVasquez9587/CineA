package umg.progra.proyecto2026.Entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_reserva_asientos")
public class detalleReserva implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_detalle")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int iddetalle;
	
	@Column (name = "id_reserva")
	private int idreserva;
	
	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public int getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public int getIdasiento() {
		return idasiento;
	}

	public void setIdasiento(int idasiento) {
		this.idasiento = idasiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column (name = "id_asiento")
	private int idasiento;
	
}
