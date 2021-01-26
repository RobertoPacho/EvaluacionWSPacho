/**
 * 
 */
package ec.edu.ups.EvaluacionWSPacho.DAO;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionWSPacho.modelo.Cliente;


/**
 * @author RobertoPacho
 *
 */
@Stateless
public class ClienteDAO {
	@PersistenceContext
	private EntityManager em;
	
	public boolean insert(Cliente cliente) throws SQLException {
		em.persist(cliente);
		return true;
	}
	
	public List<Cliente> findAll() throws Exception {
		String jpql="Select l from Cliente l";
		Query q = em.createQuery(jpql,Cliente.class);
		return (List<Cliente>) q.getResultList();
	}

}
