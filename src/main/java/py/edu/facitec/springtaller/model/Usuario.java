package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Usuario {
	
	private String login;
	private String name;
	private String password;
	
	@OneToMany(mappedBy="usuario")
	private List<Pedido> pedidos;
}
