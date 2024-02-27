package ejercicio;
import java.util.ArrayList;
import java.util.Random;

public class Cliente {
	private int id;
	private int pasword;
	double monedero;
	private ArrayList<inversion> inversiones = new ArrayList<>();
	private ArrayList<String> recibos; // Array de recibos

	public Cliente(int id, int pasword) {
		this.id = id;
		this.pasword = pasword;
		this.monedero = randomMetod();
		this.recibos = new ArrayList<>();
		
	}

	/**
	 * @return el inversiones
	 */
	public ArrayList<inversion> getInversiones() {
		return inversiones;
	}

	/**
	 * @param inversiones el inversiones a establecer
	 */
	public void setInversiones(ArrayList<inversion> inversiones) {
		this.inversiones = inversiones;
	}

	public int getPasword() {
		return pasword;
	}

	public void setPasword(int pasword) {
		this.pasword = pasword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return monedero;
	}

	public void setSaldo(double monedero) {
		this.monedero = monedero;
	}

	public double dropSaldo(double monedero) {
		return this.monedero = this.monedero - monedero;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Cliente cliente = (Cliente) obj;
		return id == cliente.id && pasword == cliente.pasword;
	}

	public double randomMetod() {
		Random random = new Random();
		return random.nextDouble(19000) + 1000;
	}
	
	 // Método para agregar un recibo al cliente
    public void agregarRecibo(String recibo) {
        recibos.add(recibo);
    }
    
    // Método para eliminar un recibo del cliente
    public void eliminarRecibo(String recibo) {
        recibos.remove(recibo);
    }
}
