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

import ec.edu.ups.EvaluacionWSPacho.modelo.Producto;


/**
 * @author RobertoPacho
 *
 */
@Stateless
public class ProductoDAO {
	@PersistenceContext
	private EntityManager em;
	
	public boolean insert(Producto producto) throws SQLException {
		em.persist(producto);
		return true;
	}
	
	public List<Producto> findAll() throws Exception {
		String jpql="Select l from Producto l";
		Query q = em.createQuery(jpql,Producto.class);
		return (List<Producto>) q.getResultList();
	}
	
	public boolean buscarProdcuto(String codigo) throws Exception {
		Query q = em.createQuery("SELECT p FROM Producto p WHERE p.codigo=:codigo");
		q.setParameter("codigo", codigo);
		if (q.getSingleResult() != null) {
			return true;
		}
		return false;
	}
	public String buscarProducto(String codigo) throws Exception {
		Query q = em.createQuery("SELECT p.nombre FROM Producto p WHERE p.codigo=:codigo");
		q.setParameter("codigo", codigo);
		return (String) q.getSingleResult();
	}

}
