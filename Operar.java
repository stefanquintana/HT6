/**
 * 
 */

/**
 * @author EMenendez
 *
 */
import java.util.*; 


public class Operar {
	Map<String, Productos> map; 
	Factory<String, Productos> factory = new Factory<String, Productos>(); 
	Scanner keyboard = new Scanner(System.in);
	Lector lector = new Lector();

	public void SetMapa(String a) {
		this.map= factory.getMap(a); 
		lector.llenarMapa(map); 
	}
	public void IngresarProducto() {
		Set<String> set= map.keySet();
		System.out.println("¿Cual categoría de producto desea agregar al inventario?");
		System.out.println("1) Mueble de terraza");
		System.out.println("2) Sillones de masaje ");
		System.out.println("3) Bebidas ");
		System.out.println("4) Condimentos ");
		System.out.println("5) Frutas ");
		System.out.println("6) Carnes ");
		System.out.println("7) Lácteos ");
		String option1 = keyboard.nextLine();
		String option2; 
		String option3; 
		boolean bool; 
		int n; 
		switch(option1) {
		case "1":
			System.out.println("Ingrese el nombre del producto de la categoria de ");
			System.out.println(" Mueble de terraza que desea ingresar al inventario");
			 option2= keyboard.nextLine();
			while(!(set.contains(option2))) {
				System.out.println("Por favor ingrese un producto que este en el posible inventario");
				option2 =keyboard.nextLine(); 
			}
			System.out.println("Ingrese la cantidad del producto que se está ingresando al invetario.");
			 option3 =keyboard.nextLine(); 
			 bool= true;
			while(bool) {
			try {
				 n= Integer.parseInt(option3);
				map.get(option2).setCantidad(n);
				bool=false; 
			}
			catch(Exception e) {
				System.out.println("Por favor ingrese un numero");
				option3 = keyboard.nextLine();
			}
			}
			break; 
		case "2":
			System.out.println("Ingrese el nombre del producto de la categoria de ");
			System.out.println(" Sillones de Masaje que desea ingresar al inventario");
			 option2= keyboard.nextLine();
			while(!(set.contains(option2))) {
				System.out.println("Por favor ingrese un producto que este en el posible inventario");
				option2 =keyboard.nextLine(); 
			}
			System.out.println("Ingrese la cantidad del producto que se está ingresando al invetario.");
			 option3 =keyboard.nextLine(); 
			 bool= true;
			while(bool) {
			try {
				n= Integer.parseInt(option3);
				map.get(option2).setCantidad(n);
				bool=false; 
			}
			catch(Exception e) {
				System.out.println("Por favor ingrese un numero");
				option3 = keyboard.nextLine();
			}
			}
			break; 
		case "3":
			System.out.println("Ingrese el nombre del producto de la categoria de ");
			System.out.println(" Bebidas que desea ingresar al inventario");
			 option2= keyboard.nextLine();
			while(!(set.contains(option2))) {
				System.out.println("Por favor ingrese un producto que este en el posible inventario");
				option2 =keyboard.nextLine(); 
			}
			System.out.println("Ingrese la cantidad del producto que se está ingresando al invetario.");
			 option3 =keyboard.nextLine(); 
			 bool= true;
			while(bool) {
			try {
				 n= Integer.parseInt(option3);
				map.get(option2).setCantidad(n);
				bool=false; 
			}
			catch(Exception e) {
				System.out.println("Por favor ingrese un numero");
				option3 = keyboard.nextLine();
			}
			}
			break;
		case "4":
			System.out.println("Ingrese el nombre del producto de la categoria de ");
			System.out.println(" Condimentos que desea ingresar al inventario");
			 option2= keyboard.nextLine();
			while(!(set.contains(option2))) {
				System.out.println("Por favor ingrese un producto que este en el posible inventario");
				option2 =keyboard.nextLine(); 
			}
			System.out.println("Ingrese la cantidad del producto que se está ingresando al invetario.");
			 option3 =keyboard.nextLine(); 
			 bool= true;
			while(bool) {
			try {
				 n= Integer.parseInt(option3);
				map.get(option2).setCantidad(n);
				bool=false; 
			}
			catch(Exception e) {
				System.out.println("Por favor ingrese un numero");
				option3 = keyboard.nextLine();
			}
			}
			break; 
		case "5":
			System.out.println("Ingrese el nombre del producto de la categoria de ");
			System.out.println(" Frutas que desea ingresar al inventario");
			 option2= keyboard.nextLine();
			while(!(set.contains(option2))) {
				System.out.println("Por favor ingrese un producto que este en el posible inventario");
				option2 =keyboard.nextLine(); 
			}
			System.out.println("Ingrese la cantidad del producto que se está ingresando al invetario.");
			 option3 =keyboard.nextLine(); 
			 bool= true;
			while(bool) {
			try {
				 n= Integer.parseInt(option3);
				map.get(option2).setCantidad(n);
				bool=false; 
			}
			catch(Exception e) {
				System.out.println("Por favor ingrese un numero");
				option3 = keyboard.nextLine();
			}
			}
			break; 
		case "6":
			System.out.println("Ingrese el nombre del producto de la categoria de ");
			System.out.println(" Carnes que desea ingresar al inventario");
			 option2= keyboard.nextLine();
			while(!(set.contains(option2))) {
				System.out.println("Por favor ingrese un producto que este en el posible inventario");
				option2 =keyboard.nextLine(); 
			}
			System.out.println("Ingrese la cantidad del producto que se está ingresando al invetario.");
			 option3 =keyboard.nextLine(); 
			 bool= true;
			while(bool) {
			try {
				 n= Integer.parseInt(option3);
				map.get(option2).setCantidad(n);
				bool=false; 
			}
			catch(Exception e) {
				System.out.println("Por favor ingrese un numero");
				option3 = keyboard.nextLine();
			}
			}
			break; 
		case "7":
			System.out.println("Ingrese el nombre del producto de la categoria de ");
			System.out.println(" Lacteos que desea ingresar al inventario");
			 option2= keyboard.nextLine();
			while(!(set.contains(option2))) {
				System.out.println("Por favor ingrese un producto que este en el posible inventario");
				option2 =keyboard.nextLine(); 
			}
			System.out.println("Ingrese la cantidad del producto que se está ingresando al invetario.");
			 option3 =keyboard.nextLine(); 
			 bool= true;
			while(bool) {
			try {
				 n= Integer.parseInt(option3);
				map.get(option2).setCantidad(n);
				bool=false; 
			}
			catch(Exception e) {
				System.out.println("Por favor ingrese un numero");
				option3 = keyboard.nextLine();
			}
			}
			break; 
			
			

		}
		
		
	}
	
	public void DevolverCategoria() {
		System.out.println("Por favor ingrese el nombre del producto");
		String option = keyboard.nextLine(); 
		Set<String> set= map.keySet();
		while(!(set.contains(option))) {
			System.out.println("Por favor ingrese un nombre valido");
				option = keyboard.nextLine(); 
		}
		System.out.println("La categoria es: ");
		System.out.println(map.get(option).getCategoria());
		
	}
	
	public void MostrarDatosSO() {
		Set<String> set= map.keySet();
		for( String elemento: set) {
			Productos prod = map.get(elemento);
			String res= "Categoria: "+ prod.getCategoria()+". Producto: " + prod.getNombre() +  ". Cantidad: "+ String.valueOf(prod.getCantidad())+"."; 
			System.out.println(res);
		}
	}
	
	public void MostrarDatosSOxC() {
		Set<String> set= map.keySet();
		for( String elemento: set) {
			if (map.get(elemento).getCantidad()>0 ) {
				Productos prod = map.get(elemento);
				String res= "Categoria: "+ prod.getCategoria()+ ". Producto: " + prod.getNombre(); 
				System.out.println(res);
			}
		}
	}
	
	public void MostrarDatosCOXC() {
		
		String[] categ = {"Bebidas ", "Carnes ", "Condimentos ", "Frutas ", "Lácteos ", "Mueble de terraza ", "Sillones de masaje "};
		Set<String> set = map.keySet();
		for(String elemento : categ) {
			for( String el: set) {
				if(map.get(el).getCategoria().equals(elemento)) {
					if(map.get(el).getCantidad()>0) {
						System.out.println("Categoria: "+map.get(el).getCategoria() + ". Producto: " + map.get(el).getNombre() );
				}
				}
			}
		}
		
		
	}
	public void MostrarDatosCO() {
		long st= System.nanoTime();
		
		String[] categ = {"Bebidas ", "Carnes ", "Condimentos ", "Frutas ", "Lácteos ", "Mueble de terraza ", "Sillones de masaje "};
		Set<String> set = map.keySet();
		//se ordenan los datos por medio de categorias 
		for(String elemento : categ) {
			
			for( String el: set) {
				if(map.get(el).getCategoria().equals(elemento)) {
					System.out.println("Categoria: "+map.get(el).getCategoria() + ". Producto: " + map.get(el).getNombre()+ ". Cantidad: " + map.get(el).getCantidad());
				}
			}
		}
		long et =System.nanoTime();
        long dif = et-st; 
        System.out.println("Tiempo total: "+String.valueOf(dif));
	}
	
	
}
