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
@Table(name = "pelicula")
public class PeliculaEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pelicula")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idpelicula;
	
	@Column (name = "titulo")
	private String titulo;
	
	@Column (name = "sinopsis")
	private String sinopsis;

	@Column (name = "duracion_minutos")
	private int duracionMinutos;
	
	@Column (name = "id_genero")
	private int idGenero;
	
	@Column (name = "id_clasificacion")
	private int idClasificacion;
	
	@Column (name = "imagen_promocional")
	private String imagen_promocional;

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getImagen_promocional() {
		return imagen_promocional;
	}

	public void setImagen_promocional(String imagen_promocional) {
		this.imagen_promocional = imagen_promocional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
