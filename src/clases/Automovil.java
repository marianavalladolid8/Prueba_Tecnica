package clases;

import java.util.Scanner;// importamos una libreria para usar scanner

public class Automovil extends Propietario {
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
	private float Tanque;
	
	
	//2.Constructor	
	public Automovil(String calle, String colonia, String ciudad, int codigoPpostal, String nombre, String rFC,
			String cURP, int nacimiento, String modelo, String color, int año, String marca, String chasis,
			String propietario, int velocidadM, int velocidadA, String npuertas, boolean techoS, int nMarchas,
			boolean transmisionA, int marchaActual, boolean estado) {
		super(calle, colonia, ciudad, codigoPpostal, nombre, rFC, cURP, nacimiento);// extiende de propietario
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
		this.MarchaActual = marchaActual;
		this.Estado = estado;
		this.MarchaActual = 0;
		this.Tanque = 50;
		
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
//Se agrego condicion para NO engranar marcha atras, si la velocidad supera los 0 km/h
public void ReducirMarcha (int Marcha) {
	if (Marcha == -1 && this.VelocidadA == 0) {
		this.MarchaActual = -1;// La reversa la representamos como -1
		System.out.println("El carro esta en reversa. Valor de la marcha actual: " + this.MarchaActual);
	} else {
		if (Marcha != -1 && this.MarchaActual > Marcha) { // Si la marcha es diferente de -1 y la marcha actual es mayor a la marcha 
			this.MarchaActual = Marcha;
			System.out.println("Se hizo el cambio a la marcha " + this.MarchaActual);
		} else {
			if (Marcha == -1 && this.VelocidadA > 0) {//La marcha es igual a -1 y la velocidad actual es mayor a 0
				System.out.println("No se puede meter reversa, el automovil esta en movimiento.");
			}
			if (Marcha != -1 && this.MarchaActual < Marcha) { //La marcha es diferente de -1 y la marcha actual es menor a la marcha
				System.out.println("No puedes reducir una marcha mayor de la que ya tienes");
			}
		}
	}
}//Reducir Marcha
 
// Método que calcule la autonomia del viaje en automovil
 public void Autonomia(int i, int j) {
	 try (Scanner in = new Scanner(System.in)) {
		double distancia, x1, x2;
		    System.out.print("Capacidad de Batería en kWh: ");
		    x1 = in.nextDouble();
		    in.nextLine();
		    System.out.print("Ingresa el consumo en kWh/100 km: ");
		    x2 = in.nextDouble();
		    in.nextLine();
		    distancia=Math.sqrt((x1/x2)* 100);
		    System.out.println("Valor de la autonimia del viaje: " + distancia);
	}//void
 }//Scanner
 
 //Método para calcular el combustible
 public void Combustible(int gas) {
	 float volumen = gas/this.Tanque *100;
	 System.out.println("El tanque de gasolina tiene " + volumen + " % de capacidad");
	 
 }//void
	 
 
 
	@Override
	public String toString() {
		return "Automovil [Modelo=" + Modelo + ", Color=" + Color + ", Año=" + Año + ", Marca=" + Marca + ", Chasis="
				+ Chasis + ", Propietario=" + Propietario + ", VelocidadM=" + VelocidadM + ", VelocidadA=" + VelocidadA
				+ ", Npuertas=" + Npuertas + ", TechoS=" + TechoS + ", NMarchas=" + NMarchas + ", TransmisionA="
				+ TransmisionA + "]";
	
}//toString

	
	}//Clase Automovil

