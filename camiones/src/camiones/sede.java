package camiones;
import java.util.ArrayList;

public class sede {
	
	/**  ------------------------------------- Atributos de la sede -------------------------------------
	 * 
	 */
		
	private String ciudad;
	
	
	
	/** -------------------------------------Metodo creador de la sede -------------------------------------
	 * 
	 */
	
	public sede(String nombreCiudad)
	{
		this.ciudad = nombreCiudad;
	}
	
	
	/** -------------------------------------Metodo para enlistar paquetes -------------------------------------
	 * 
	 */
	
	
	/** Metodo para añadir paquetes despachados
	 * 
	 */
	
	public ArrayList<Object> paqueteDespachado = new ArrayList<Object> ();
			{
				paqueteDespachado.add(this);
			}
	
	/** Metodo para añadir paquetes por despachar
	* 			 
	* */
			
	public ArrayList<Object> paquetePorDespachar = new ArrayList<Object> ();
					{
						paquetePorDespachar.add(this);
					}
	/** Metodo para añadir paquetes que han llegado
	* 			 
	* */
							
	public ArrayList<Object> paqueteLlegado = new ArrayList<Object> ();
						{
							paqueteLlegado.add(this);
						}
}
