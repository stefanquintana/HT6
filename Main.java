import java.util.Scanner;
import java.io.BufferedWriter;

/**
 * 
 */

/**
 * @author EMenendez
 *
 */
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Operar operacion = new Operar(); 
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a nuestro sistema inventario. Seleccione El tipo de mapa ");
		System.out.println("1) Hashmap");
		System.out.println("2) Treemap");
		System.out.println("3) LinkedHashmap");
		String hash= keyboard.nextLine(); 
		operacion.SetMapa(hash);
		boolean bool = true; 
		while (bool) {
		System.out.println("Bienvenido a nuestro sistema inventario. Seleccione que desea hacer: ");
		System.out.println("1) Agregar productos al inventario. ");
		System.out.println("2) Mostrar la categoria de un producto particular. ");
		System.out.println("3) Mostrar los datos del producto, categoría y la cantidad  de  cada articulo que tiene en su colección.");
		System.out.println("4) Mostrar los datos del producto, categoría y la cantidad  de  cada articulo que tiene en su colección por tipo.d");
		System.out.println("5) Mostrar el producto y la categoría de todo el inventario.  ");
		System.out.println("6) Mostrar el producto y la categoría de todo el inventario por tipo.");
		System.out.println("7) Salir.");
		String opcion = keyboard.nextLine();
		
			switch(opcion){
			case "1": operacion.IngresarProducto(); break; 
			case "2": operacion.DevolverCategoria(); break; 
			case "3": operacion.MostrarDatosSO(); break; 
			case "4": operacion.MostrarDatosCO(); break;
			case "5": operacion.MostrarDatosSOxC(); break; 
			case "6": operacion.MostrarDatosCOXC(); break;
			case "7": bool= false; break; 
			default: System.out.println("Ingrese una opcion valida"); break; 
		}
		}
		}

}
