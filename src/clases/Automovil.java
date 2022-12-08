package clases;

public class Automovil {
	//1. Propiedades -Declarar atributos
	
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
	}
	
	
	
	
	
}//Clase Automovil
