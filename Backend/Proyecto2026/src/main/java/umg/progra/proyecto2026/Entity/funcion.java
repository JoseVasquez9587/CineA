package umg.progra.proyecto2026.Entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcion")
public class funcion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_funcion")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idfuncion;
	
	@Column (name = "id_pelicula")
	private int idpelicula;
	
	@Column (name = "id_sala")
	private int idsala;
	
	@Column (name = "fecha")
	private Date fecha;

	@Column (name = "hora")
	private Time hora;
	
	@Column (name = "precio_entrada")
	private double precioEntrada;

	public int getIdfuncion() {
		return idfuncion;
	}

	public void setIdfuncion(int idfuncion) {
		this.idfuncion = idfuncion;
	}

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public int getIdsala() {
		return idsala;
	}

	public void setIdsala(int idsala) {
		this.idsala = idsala;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
