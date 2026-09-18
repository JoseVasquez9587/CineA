package umg.progra.proyecto2026.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class ReservaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_reserva")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idreserva;

	@Column(name = "id_cliente")
	private int idcliente;

	@Column(name = "id_funcion")
	private int idFuncion;

	@Column(name = "cantidad_entradas")
	private int cantidadentradas;

	@Column(name = "total_a_pagar")
	private double totalapagar;

	@Column(name = "fecha_reserva")
	private Date fechareserva;

	public int getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}

	public int getCantidadentradas() {
		return cantidadentradas;
	}

	public void setCantidadentradas(int cantidadentradas) {
		this.cantidadentradas = cantidadentradas;
	}

	public double getTotalapagar() {
		return totalapagar;
	}

	public void setTotalapagar(double totalapagar) {
		this.totalapagar = totalapagar;
	}

	public Date getFechareserva() {
		return fechareserva;
	}

	public void setFechareserva(Date fechareserva) {
		this.fechareserva = fechareserva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}