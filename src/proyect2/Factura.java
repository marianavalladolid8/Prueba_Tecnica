package proyect2;

public class Factura {
	//Proyecto 2 Facturas
	// Se declaran las siguientes Variables
	// 1. Atributos
	String Numero;
	String Descripcion;
	int [] CantidadCompradaDeArticulo;
	double []PrecioArticulo;
	
	
	//2. Constructor
	
	public Factura(String numero, String descripcion, int []cantidadCompradaDeArticulo, double [] precioArticulo) {
		super();
		Numero = numero;
		Descripcion = descripcion;
		CantidadCompradaDeArticulo = cantidadCompradaDeArticulo;
		PrecioArticulo = precioArticulo;
	}//Constructor
	
	//3. Métodos Getters y Setters

	public String getNumero() {
		return Numero;
	}//getnumero

	public void setNumero(String numero) {
		Numero = numero;
	}//setnumero

	public String getDescripcion() {
		return Descripcion;
	}//get descripcion

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}//setdescripcion

	public int [] getCantidadCompradaDeArticulo() {
		return CantidadCompradaDeArticulo;
	}//getcantidad

	public void setCantidadCompradaDeArticulo(int[] cantidadCompradaDeArticulo) {
		CantidadCompradaDeArticulo = cantidadCompradaDeArticulo;
	}//setcantidad

	public double[] getPrecioArticulo() {
		return PrecioArticulo;
	}//getprecio

	public void setPrecioArticulo(double[] precioArticulo) {
		PrecioArticulo = precioArticulo;
	}//setprecio
	
	//Método IntegerSet
	/*Que calcule y luego devuelva en un double Cantidad de articulos */
	public void getTotalFactura(int articulosdif) {
		double totalfact=0;
		for(int i = 0; i<articulosdif;i++){
			totalfact+= CantidadCompradaDeArticulo[i]*PrecioArticulo[i];
		}
		System.out.println("Total de la factura "+Numero+" :"+totalfact);
		}//void
	//metodo

	
	
	@Override
	public String toString() {
		return "Factura [Numero=" + Numero + ", Descripcion=" + Descripcion + ", CantidadCompradaDeArticulo="
				+ CantidadCompradaDeArticulo + ", PrecioArticulo=" + PrecioArticulo + "]";
	}//toString
	
	
	
	
}//Class