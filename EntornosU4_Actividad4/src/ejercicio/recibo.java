package ejercicio;
import java.util.Random;
public class recibo {
	private String nombre ;
	private double cantidad;
	
	public recibo(String nombre, double cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		
	}
	
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return la cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad a establecer
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public boolean pagarRecibo () {
		Random r = new Random();
		double probabilidadPago = r.nextDouble(4) +1 ;
		return probabilidadPago >1;
	}

}
