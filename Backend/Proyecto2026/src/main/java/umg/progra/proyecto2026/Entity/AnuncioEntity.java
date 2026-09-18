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
@Table(name = "anuncio")
public class AnuncioEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_anuncio")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idanuncio;
	
	@Column (name = "titulo")
	private String titulo;
	
	@Column (name = "descripcion")
	private String descripcion;
	
	@Column (name = "fecha_publicacion")
	private Date fechaPublicacion;
	    
    public int getIdanuncio() {
		return idanuncio;
	}

	public void setIdanuncio(int idanuncio) {
		this.idanuncio = idanuncio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "imagen") 
    private String imagen;
    

}
