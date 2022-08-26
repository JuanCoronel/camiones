package camiones;

public class packages {


/** Atributos del paquete a crear
 * 
 */
	
private Integer peso;

private Integer valor;

private String destino;

private String sedeDespacho;

private String sedeLlegada;

private camion camion;


/** Metodo creador del paquete con toda su informacion
 * 
 */

public packages(Integer elPeso, Integer elValor, String elDestino, String sedeProveniente, String sedeObjetivo)
{
	this.peso = elPeso;
	this.valor = elValor;
	this.destino = elDestino;
	this.sedeDespacho = sedeProveniente;
	this.sedeLlegada = sedeObjetivo;
	
}

public void asignarCamion(camion queue) {
	
	
}

public static void main(String args[]) {
	
}


}
