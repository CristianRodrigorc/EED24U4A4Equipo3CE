package actividad_5;

public class InversionMain {
public static void main(String[] args) {
		
        Inversion inversion = new Inversion("Inversion1", 1000);
        
        System.out.println("Cantidad inicial de la inversión: " + inversion.cantidad);
        double beneficios = inversion.obtenerBeneficios();
        
        System.out.println("Beneficios obtenidos: " + beneficios);
        System.out.println("Cantidad después de los beneficios: " + inversion.cantidad);
    }
}
