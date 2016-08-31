package py.edu.facitec.springtaller.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue
	private long id;
	private Date fechaToma;
	private Date fechaEntrega;
	private double total;
	
	
	//Indicamos que se trata de una 
	//relacion de mucho para uno
	//posibilita la creacion de la clave
	//foranea
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy="pedido")
	private List<ItemPedido> itemPedidos;

	
	
	
	
	
	
}
