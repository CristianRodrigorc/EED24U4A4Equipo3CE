package actividad_5;

import java.util.Random;

public class Inversion {
	String nombre;
	double cantidad;
	Random random;

	public Inversion(String nombre, double cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.random = new Random();
	}

	public double obtenerBeneficios() {
		if (random.nextDouble() < 0.5) {
			double beneficios = -1 * random.nextDouble() * (0.05 + (0.75 - 0.05) * random.nextDouble()) * cantidad;
			cantidad += beneficios;
			return beneficios;
		} else {
			double beneficios = random.nextDouble() * (0.05 + (0.75 - 0.05) * random.nextDouble()) * cantidad;
			cantidad += beneficios;
			return beneficios;
		}

	}
}
