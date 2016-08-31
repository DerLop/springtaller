package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//Significa que se creara una tabla Cliente
@Entity
//@Table(name"")
public class Cliente {
	//Identificacion de clave primaria
	@Id
	//Generacion automatica de valor
	@GeneratedValue
	private Integer id;
	
	private String nombre;
	private String correo;
	
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedidos;

	
	
	
}
