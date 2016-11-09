package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import py.edu.facitec.springtaller.model.general.General;
//Significa que se creara una tabla Cliente
@Entity
//@Table(name"")
public class Cliente extends General {
	//Identificacion de clave primaria
	//@Id
	//Generacion automatica de valor
	//@GeneratedValue
	//private Integer id;
	
	private String nombre;
	private String correo;
	
	//Anotacion aplicada para ignorar el atributo de json
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedidos;

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", correo=" + correo + ", pedidos=" + pedidos
				+ ", toString()=" + super.toString() + "]";
	}
	
}
