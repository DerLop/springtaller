package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue
	private long id;
	
	private int cantidadProducto;
	private double subTotal;
	
	
	
	@ManyToOne
	private Pedido pedido;
	
	@OneToMany(mappedBy="itempedido")
	private List<Pedido> pedidos;
	
	@ManyToOne
	private Producto producto;
	
}
