/**
 * 
 */
package ec.edu.ups.EvaluacionWSPacho.ON;

import java.sql.SQLException;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.edu.ups.EvaluacionWSPacho.DAO.ProductoDAO;
import ec.edu.ups.EvaluacionWSPacho.modelo.Producto;


/**
 * @author RobertoPacho
 *
 */
@Stateless
public class ProductoON {
	
	@Inject
	private ProductoDAO productoDAO;
	
	public boolean insert(Producto producto) throws SQLException {
		return productoDAO.insert(producto);
	}
	
	public List<Producto> findAll() throws Exception {
		return productoDAO.findAll();
	}
	
	public boolean verificarproducto(String codigo) throws Exception {
		return productoDAO.buscarProdcuto(codigo);
	}
	
	public String retorna(String codigo) throws Exception {
		return productoDAO.buscarProducto(codigo);
	}

}
