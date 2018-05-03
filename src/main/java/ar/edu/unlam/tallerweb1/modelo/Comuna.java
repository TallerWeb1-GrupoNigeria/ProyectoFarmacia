package ar.edu.unlam.tallerweb1.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Comuna")
public class Comuna {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;

	
	// RELACIONES
	@OneToMany(mappedBy="comuna")
	private List<Barrio> barrio = new ArrayList<>();

	
	// CONSTRUCTORES	
	public Comuna() {
	}

	public Comuna(String nombre, List<Barrio> barrio) {
		this.nombre = nombre;
		this.barrio = barrio;
	}

	
	// GET SET
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Barrio> getBarrio() {
		return barrio;
	}

	public void setBarrio(List<Barrio> barrio) {
		this.barrio = barrio;
	}
	
	
	
	
		
		
		
}
