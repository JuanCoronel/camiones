package camiones;
import java.util.LinkedList;
import java.util.Queue;


public class camion {
	/** Atributos del camion
	 * 
	 */
		
	private String placa;

	private Integer maxCap;

	private Integer km;
	
	
	/** Metodo creador del camion de distribucion
	 * 
	 */
		
	public camion(Integer kmRun, String laPlaca, Integer capacidadMax )
	{
		this.placa = laPlaca;
		this.maxCap = capacidadMax;
		this.km = kmRun;
	}
	
	/** Metodo para agregar un camion a la cola; el primer camion en la cola sera 
	 * el que tendra a cargo el proximo paquete
	 * 
	 */
	
	public void colaCamion()
	{
		
		Queue<Object> queue = new LinkedList<>();
		queue.add(this);
		
	}
}
