import java.util.*;
/**
 * @author Stefan Quintana, Estuardo Menéndez
 * Clase Factory
 * @param <K>
 * @param <V>
 */

public class Factory<K,V> {
	
	/**
	 * Método para devolver el mapa con el qe el usuario desea que se corra el programa
	 * @param opcion
	 * @return el tipo de Map deseado
	 */
	public Map<K,V> getMap(String opcion){
		//Si escoge la opción 1: HashMap
		if(opcion.equals("1")) {
			return new HashMap<K,V>();
		}
		else
			//Si escoge la opción 2: TreeMap
			if(opcion.equals("2")) {
				return new TreeMap<K,V>();
			}
			else
				//Si escoge la opción 3: LinkedHashMap
				if(opcion.equals("3")) {
					return new LinkedHashMap<K,V>();
				}
				//Si no escoge ninguna devolver null e indicar que digite correctamente una opción
				else {
					System.out.println("Digitar correctamente una opción");
					return null;
				}
		
		
	}
	
}
