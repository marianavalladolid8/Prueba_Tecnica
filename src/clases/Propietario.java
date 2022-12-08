package clases;

public class Propietario {
	//1. Propiedades -Declarar atributos
	
	private String Nombre;
	private String RFC;
	private String CURP;
	private int Nacimiento;
	private String Calle;
	private String Colonia;
	private String Ciudad;
	private int CP;

	// 2. Constructor - Encapsulamiento de los atributos
	public Propietario(String nombre, String rFC, String cURP, int nacimiento, String calle, String colonia,
			String ciudad, int cP) {
		super();
		Nombre = nombre;
		RFC = rFC;
		CURP = cURP;
		Nacimiento = nacimiento;
		Calle = calle;
		Colonia = colonia;
		Ciudad = ciudad;
		CP = cP;
	}//constructor 1
	
	public Propietario(String nombre, String rFC, String cURP) {
		super();
		Nombre = nombre;
		RFC = rFC;
		CURP = cURP;
	}// constructor2
	
	
	// 3. Metodos 

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

	
	//toString
	@Override
	public String toString() {
		return "Propietario [Nombre=" + Nombre + ", RFC=" + RFC + ", CURP=" + CURP + ", Nacimiento=" + Nacimiento
				+ ", Calle=" + Calle + ", Colonia=" + Colonia + ", Ciudad=" + Ciudad + ", CP=" + CP + "]";
	}//toString
	
	

	
	
	
	
	
	
}// Class Propietario
