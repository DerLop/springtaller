package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Usuario {
	
	@Id
	private String login;
	private String name;
	private String password;
	
	@JsonBackReference
	@ManyToOne
	private Departamento departamento;
	
	@JsonManagedReference
	@OneToMany(mappedBy="usuario")
	private List<Pedido> pedidos;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", name=" + name + ", password=" + password + ", departamento="
				+ departamento + ", pedidos=" + pedidos + ", toString()=" + super.toString() + "]";
	}
	

	
	
	
}
