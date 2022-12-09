package clases;

public class Marca extends Automovil{
	// 1. Se creo una nueva clase, con atributos privados
	
	private String Marca;
	private String CarroNombre;
	private int NumeroModelo;
	private int AñoLanzamiento;
	private int CodigoID;
	
	
	//2. Constructor
	public Marca(String calle, String colonia, String ciudad, int codigoPpostal, String nombre, String rFC, String cURP,
			int nacimiento, String modelo, String color, int año, String marca, String chasis, String propietario,
			int velocidadM, int velocidadA, String npuertas, boolean techoS, int nMarchas, boolean transmisionA,
			int marchaActual, boolean estado, String marca2, String carroNombre, int numeroModelo, int añoLanzamiento,
			int codigoID) {
		super(calle, colonia, ciudad, codigoPpostal, nombre, rFC, cURP, nacimiento, modelo, color, año, marca, chasis,
				propietario, velocidadM, velocidadA, npuertas, techoS, nMarchas, transmisionA, marchaActual, estado);
		// extiende de automovil
		Marca = marca2;
		CarroNombre = carroNombre;
		NumeroModelo = numeroModelo;
		AñoLanzamiento = añoLanzamiento;
		CodigoID = codigoID;
	}//constructor

//3. Getters y Setters
	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public String getCarroNombre() {
		return CarroNombre;
	}


	public void setCarroNombre(String carroNombre) {
		CarroNombre = carroNombre;
	}


	public int getNumeroModelo() {
		return NumeroModelo;
	}


	public void setNumeroModelo(int numeroModelo) {
		NumeroModelo = numeroModelo;
	}


	public int getAñoLanzamiento() {
		return AñoLanzamiento;
	}


	public void setAñoLanzamiento(int añoLanzamiento) {
		AñoLanzamiento = añoLanzamiento;
	}


	public int getCodigoID() {
		return CodigoID;
	}


	public void setCodigoID(int codigoID) {
		CodigoID = codigoID;
	}// Fin de Getters y Setters

	@Override
	public String toString() {
		return "Marca [Marca=" + Marca + ", CarroNombre=" + CarroNombre + ", NumeroModelo=" + NumeroModelo
				+ ", AñoLanzamiento=" + AñoLanzamiento + ", CodigoID=" + CodigoID + "]";
	}//toString
	

}//Class
