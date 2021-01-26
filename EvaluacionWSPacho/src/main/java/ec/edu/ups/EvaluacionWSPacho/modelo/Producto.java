/**
 * 
 */
package ec.edu.ups.EvaluacionWSPacho.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author RobertoPacho
 *
 */
@Entity
@Table(name = "Producto")
public class Producto {
	@Id
    @Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "codigoproducto")
	private String codigoproducto;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "costo")
	private double costo;

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoproducto() {
		return codigoproducto;
	}

	public void setCodigoproducto(String codigoproducto) {
		this.codigoproducto = codigoproducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigoproducto=" + codigoproducto + ", cantidad="
				+ cantidad + "]";
	}
}
