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
@Table(name = "sala")
public class SalaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_sala")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idsala;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "filas")
	private int filas;

	@Column(name = "asientos_por_fila")
	private int asientosporfila;

	public int getIdsala() {
		return idsala;
	}

	public void setIdsala(int idsala) {
		this.idsala = idsala;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getAsientosporfila() {
		return asientosporfila;
	}

	public void setAsientosporfila(int asientosporfila) {
		this.asientosporfila = asientosporfila;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}