package ec.edu.ups.EvaluacionWSPacho.Servicios;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.edu.ups.EvaluacionWSPacho.ON.ClienteON;
import ec.edu.ups.EvaluacionWSPacho.ON.ProductoON;
import ec.edu.ups.EvaluacionWSPacho.modelo.Producto;

@Path("empleado")
public class ClienteServiceREST {

	@Inject
	private ClienteON clienteON;
	@Inject
	private ProductoON productoON;
	@Inject
	private Producto producto;

	@GET
	@Path("multiplicacion/{a}/{b}")
	public int multi(@PathParam("a") int a, @PathParam("b") int b) {
		return a * b;
	}

	@GET
	@Path("guardarproducto/{codigo}/{cantidad}")
	public String guardarProducto(@PathParam("codigo") String codigo, @PathParam("cantidad") int cantidad)throws Exception {
		String estado="";
		List<Producto> listap=new ArrayList<Producto>();
		listap=productoON.findAll();
		for (int i = 0; i < listap.size(); i++) {
			if (listap.get(i).getCodigoproducto().equals(codigo)) {
				/*
				 * int id=productoON.findAll().size()+1; producto.setId(id);
				 * producto.setCodigoproducto(codigo); producto.setNombre("cartera");
				 * producto.setCantidad(cantidad); productoON.insert(producto);
				 */
				estado=listap.get(i).getNombre();
				
			}else { 
			estado="Producto no existente";
			}
			
		}
		return estado;
	}

}
