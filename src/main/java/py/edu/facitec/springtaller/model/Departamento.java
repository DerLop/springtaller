package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue
	private long id;
	private String descripcion;
	private List<Usuario> listaUsuarios;
	
	//indicamos que es una relacion
	//de uno a uno
	@OneToOne
	private Gerente gerente;
	
	
	
	
}
