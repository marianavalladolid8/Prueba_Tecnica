package clases;

public class Automovil {
	//1. Propiedades -Declarar atributos privados
	
	private String Modelo;
	private String Color;
	private int Año;
	private String Marca;
	private String Chasis;
	private String Propietario; 
	private int VelocidadM;
	private int VelocidadA;
	private String Npuertas;
	private boolean TechoS;
	private int NMarchas;
	private boolean TransmisionA;
	
	private int MarchaActual;
	boolean Estado = false;
	
	
	//2.Constructor
	public Automovil(String modelo, String color, int año, String marca, String chasis, String propietario, int velocidadM, int velocidadA, String npuertas, boolean techoS, int nMarchas, boolean transmisionA) {
		super();
		this.Modelo = modelo;
		this.Color = color;
		this.Año = año;
		this.Marca = marca;
		this.Chasis = chasis;
		this.Propietario = propietario;
		this.VelocidadM = velocidadM;
		this.VelocidadA = velocidadA;
		this.Npuertas = npuertas;
		this.TechoS = techoS;
		this.NMarchas = nMarchas;
		this.TransmisionA = transmisionA;
		this.MarchaActual = 0;
	}// constructor

	//3.Getters y Setters
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getChasis() {
		return Chasis;
	}

	public void setChasis(String chasis) {
		Chasis = chasis;
	}

	public String getPropietario() {
		return Propietario;
	}

	public void setPropietario(String propietario) {
		Propietario = propietario;
	}

	public int getVelocidadM() {
		return VelocidadM;
	}

	public void setVelocidadM(int velocidadM) {
		VelocidadM = velocidadM;
	}

	public int getVelocidadA() {
		return VelocidadA;
	}

	public void setVelocidadA(int velocidadA) {
		VelocidadA = velocidadA;
	}

	public String getNpuertas() {
		return Npuertas;
	}

	public void setNpuertas(String npuertas) {
		Npuertas = npuertas;
	}

	public boolean isTechoS() {
		return TechoS;
	}

	public void setTechoS(boolean techoS) {
		TechoS = techoS;
	}

	public int getNMarchas() {
		return NMarchas;
	}

	public void setNMarchas(int nMarchas) {
		NMarchas = nMarchas;
	}

	public boolean isTransmisionA() {
		return TransmisionA;
	}

	public void setTransmisionA(boolean transmisionA) {
		TransmisionA = transmisionA;
	}// fin de getters y setters
	
			//Método para aceleración aumento de 1 en 1 km/h
	public void Aceleracion() {
		this.VelocidadA += 1;
		System.out.println("El Vocho va a una velocidad de : "+ VelocidadA + " Km/h");
		
	}//aceleración
	
	
			//Método para frenado del automaovil
public void Freno() {
	this.VelocidadA = 0;
	System.out.println("El Vocho ha frenado. Velocidad actual: " + this.VelocidadA);
	}//freno

//Implementar método que permita cambiar marchas
public void CambiarMarcha (int Marcha) {
	this.MarchaActual = Marcha;
	System.out.println("Se engrano a la marcha: " + this.MarchaActual);
	
}//Cambiar Marchas

//Método para reducir marchas
public void ReducirMarcha () {
	this.MarchaActual -= 1;
	System.out.println("Se ha disminuido a la marcha: "+ this.MarchaActual);
	if (Estado == true) {
		System.out.println("Engranamos marcha atras");
		Estado = true;
	}else {
		System.out.println("No es posible engranar marcha atras");
	}
}//Reducir Marcha
 

	@Override
	public String toString() {
		return "Automovil [Modelo=" + Modelo + ", Color=" + Color + ", Año=" + Año + ", Marca=" + Marca + ", Chasis="
				+ Chasis + ", Propietario=" + Propietario + ", VelocidadM=" + VelocidadM + ", VelocidadA=" + VelocidadA
				+ ", Npuertas=" + Npuertas + ", TechoS=" + TechoS + ", NMarchas=" + NMarchas + ", TransmisionA="
				+ TransmisionA + "]";
	
}//toString

	
	}//Clase Automovil

