package py.edu.facitec.springtaller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String ci;
	private String nombre;
	
	@OneToOne(mappedBy="gerente")
	private Departamento departamento;
	
	
	
}
