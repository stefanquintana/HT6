/**
 * 
 */

/**
 * @author EMenendez
 *
 */
public class Productos {
	
	String nombre = "";
	String categoria="";
	int cantidad=0; 
	
	/**
	 * @param Nombre
	 * @param Categoria
	 * @param Cantidad
	 */
	public Productos(String Nombre, String Categoria) {
		this.nombre= Nombre; 
		this.categoria= Categoria; 
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
