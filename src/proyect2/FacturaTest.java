package proyect2;
import java.util.Scanner;
public class FacturaTest {
	/*Se implementa el uso de Scanner para obtener informacion ususario sobre la Factura*/
	public static void main(String[] args) {
		Scanner pregunta = new Scanner (System.in);
		System.out.println("Ingresa el numero de la factura: ");
		String NFactura = pregunta.next();
		pregunta.nextLine();
		System.out.println("Ingresa la descripcion de la factura: ");
		String DescrpcionFactura = pregunta.next();
		pregunta.nextLine();
		System.out.println("Ingresa la cantidad de articulos diferentes: ");
		int ArticulosDiferentes = pregunta.nextInt();
		pregunta.nextLine();
		int[] CantidadObjetos;//Para almacenar la cantidad de objetos
		CantidadObjetos = new int[ArticulosDiferentes];//Inicializamos la variable
		double [] Precios;//Para almacenar precios
		Precios = new double[ArticulosDiferentes];//Inicializamos la variable
		
		for (int i= 0; i<ArticulosDiferentes;i++) {
			System.out.println("Cuantas unidades hay del articulo "+(i+1)+" :");
			CantidadObjetos[i]= pregunta.nextInt();
			pregunta.nextLine();
			System.out.println("Cual es el precio del articulo "+(i+1)+" :");
			Precios[i]= pregunta.nextDouble();
			pregunta.nextLine();
		}
				pregunta.close();// cierra Scanner
				
				
			// Funcion que manda llamar las capacidades de Factura	
		Factura Monto = new Factura (NFactura, DescrpcionFactura, CantidadObjetos, Precios);
		Monto.getTotalFactura(ArticulosDiferentes);
				
	}//void

}//class
