import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 * 
 * @author Stefan Quintana, Estuardo Menendez
 * Clase para leer archivo y llenar el mapa con los datos
 */

public class Lector {
	
	/**
	 * Método para leer el archivo y obtener un String
	 * @param leerArchivo
	 * @return String codigo : String con los datos del archivo
	 */
	public static String leerArchivo(String nombre) {
		File archivo = null;
		FileReader fr = null;
	    BufferedReader br = null;
	    String codigo = "";

	    try {
	    	// Apertura del fichero y creacion de BufferedReader para poder
	        // hacer una lectura comoda (disponer del metodo readLine()).
	        archivo = new File (nombre);
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);

	        // Lectura del fichero
	        String linea;
	        while((linea=br.readLine())!=null) {
	        	codigo = codigo + linea + "\n";
	        }
	    }
	    
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	    finally{
	    	// En el finally cerramos el fichero, para asegurarnos
	        // que se cierra tanto si todo va bien como si salta 
	        // una excepcion.
	    	try{                    
	    		if( null != fr ){   
	    			fr.close();     
	    		}                  
	    	}catch (Exception e2){
	    		e2.printStackTrace();
	    	}
	    }
		return codigo;
	}
	
	/**
	 * Método para llenar el mapa
	 * @param mapa
	 * @return mapa : devolver el mapa lleno
	 */
	public Map<String, Productos> llenarMapa(Map<String, Productos> mapa) {
		//Se lee el archivo
		String codigo = leerArchivo("ListadoProducto.txt");
		//Se separa en enters
		String[] lista = codigo.split("\n");
		
		//Se hace una lista donde se sepa que sus valores serán los importantes
		String[] nuevaLista = new String[29];
		
		//Ciclo for para llenar la nueva lista
		for(int i = 0; i < 29; i++) {
			nuevaLista[i] = lista[i];
		}
		
		//Ciclo for para llenar el mapa
		for(int i = 0; i < 29; i++) {
			//Dividir el String
			String[] dividido = nuevaLista[i].split("");
			//Hacer variables para nombre y categoria
			String Categoria = "";
			String Nombre = "";
			//Contador del string "|"
			int contador = 0;
			//Ciclo for para llenar el nombre y categoria
			for(String elemento : dividido) {
				if(elemento.equals("|")) {
					//Incrementar contador
					contador++;
				}
				else {
					//Llenar categoria
					if(contador == 0) {
						Categoria = Categoria + elemento;
					}
					//Llenar nombre
					else {
						Nombre = Nombre + elemento;
					}
				}
				
			}
			
			//Quitar los espacios innecesarios
			Nombre = quitarBasura(Nombre);
			
			//Hacer un producto nuevo
			Productos producto = new Productos(Nombre, Categoria);
			
			//Llenar el mapa
			mapa.put(Nombre, producto);
		}
		
		//Devolver el mapa lleno
		return mapa;
		
	}
	
	/**
	 * Método para quitar espacios innecesarios
	 * @param linea
	 * @return linea : linea sin espacios innecesarios
	 */
	public static String quitarBasura(String linea) {
		//Se separa el strinf en caracteres
		char[] r = linea.toCharArray();
		//Se crea un arrayList
		ArrayList<String> nvL = new ArrayList<String>();
		//Ciclo for para añadir los caracteres al ArrayList
		for(char c : r) {
			String n = Character.toString(c);
			nvL.add(n);
		}
		//Vaciar la linea
		linea = "";
		//Ciclo for para quitar espacios
		for(int i = 1; i < nvL.size(); i++) {
			//Si el caracter actual es espacio revisa si el anterior era espacio o no
			if(nvL.get(i).equals(" ")) {
				//En caso de serlo no lo agrega a la lina
				if(nvL.get(i-1).equals(" ")) {
					
				}
				//Si no es espacio lo agrega
				else {
					linea = linea + nvL.get(i);
				}
				
			}
			//Si no es espacio para empezar solo lo agrega
			else {
				linea = linea + nvL.get(i);
			}
			
		}
		//Devuelve el string
		return linea;
		
	}
}
