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
@Table(name = "Cliente")
public class Cliente {
	
	@Id
    @Column(name = "id")
	private int id;
	@Column(name = "cedula")
	private String cedula;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "correo")
	private String correo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + "]";
	}

}
