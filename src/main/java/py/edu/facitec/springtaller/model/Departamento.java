package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import py.edu.facitec.springtaller.model.general.General;

@Entity
public class Departamento extends General {
	
	private String descripcion;
	@OneToMany(mappedBy="departamento")
	private List<Usuario> listaUsuarios;
	
	//indicamos que es una relacion
	//de uno a uno
	@OneToOne
	private Gerente gerente;
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Departamento [descripcion=" + descripcion + ", listaUsuarios=" + listaUsuarios
				+ ", gerente=" + gerente + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
