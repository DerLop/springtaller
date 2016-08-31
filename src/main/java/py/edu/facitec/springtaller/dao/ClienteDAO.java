package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Cliente;

@Repository
//Clase encargada de la manipulacion de datos, posibilita posteriormente utilizar la anotacion
//Autowired
public class ClienteDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Cliente cliente){

				//metodo para insertar los datos
		manager.persist(cliente);
	}

}
