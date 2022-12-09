package clases;

public class Propietario extends Direccion {
	//1. Propiedades -Declarar atributos privados
	
	private String Nombre;
	private String RFC;
	private String CURP;
	private int Nacimiento;
	

	// 2. Constructor - Encapsulamiento de los atributos
	public Propietario(String calle, String colonia, String ciudad, int codigoPpostal, String nombre, String rFC,
			String cURP, int nacimiento) {
		super(calle, colonia, ciudad, codigoPpostal);// extiende de direccion
		Nombre = nombre;
		RFC = rFC;
		CURP = cURP;
		Nacimiento = nacimiento;
	}
	

	public Propietario(String calle, String colonia, String ciudad, int codigoPpostal, String nombre, String rFC,
			String cURP) {// atributos obligatorios
		super(calle, colonia, ciudad, codigoPpostal);//extiende de direccion
		Nombre = nombre;
		RFC = rFC;
		CURP = cURP;
	}

	
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
