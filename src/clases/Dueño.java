package clases;

public class Dueño {
	//1. Propiedades -Declarar atributos privados
	
	private String Nombre;
	private String RFC;
	private String CURP;
	private int Nacimiento;
	

	// 2. Constructor - Encapsulamiento de los atributos
	
	public Dueño(String nombre, String rFC, String cURP, int nacimiento) {
		super();
		Nombre = nombre;
		RFC = rFC;
		CURP = cURP;
		Nacimiento = nacimiento;
	}//constructor 1
	
	

	public Dueño(String nombre, String rFC, String cURP) {
		super();
		Nombre = nombre;
		RFC = rFC;
		CURP = cURP;
	}// constructor2
	
	
	// 3. Métodos 

	public String getNombre() {
		return Nombre;
	}//getNombre

	public void setNombre(String nombre) {
		Nombre = nombre;
	}//setNombre

	public String getRFC() {
		return RFC;
	}//getRFC

	public void setRFC(String rFC) {
		RFC = rFC;
	}//setRFC

	public String getCURP() {
		return CURP;
	}//getCURP

	public void setCURP(String cURP) {
		CURP = cURP;
	}//setCURP



	@Override //toString
	public String toString() {
		return "Dueño [Nombre=" + Nombre + ", RFC=" + RFC + ", CURP=" + CURP + ", Nacimiento=" + Nacimiento + "]";
	}//toString
	
	

	
	
	
	
	
	
}// Class Propietario
