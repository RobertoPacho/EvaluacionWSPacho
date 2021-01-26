/**
 * 
 */
package ec.edu.ups.EvaluacionWSPacho.ON;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionWSPacho.DAO.ClienteDAO;
import ec.edu.ups.EvaluacionWSPacho.modelo.Cliente;


/**
 * @author RobertoPacho
 *
 */
@Stateless
public class ClienteON {
	
	@Inject
	private ClienteDAO clienteDAO;
	
	public boolean insert(Cliente cliente) throws SQLException {
		return clienteDAO.insert(cliente);
	}
	
	public List<Cliente> findAll() throws Exception {
		return clienteDAO.findAll();
	}

}
