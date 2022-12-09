package clases;

public class Direccion {
	
		// 1. Se creo una nueva clase, donde los atributos referentes a direccion formen parte de ella
		private String Calle;
		private String Colonia;
		private String Ciudad;
		private int CodigoPpostal;
		
		
	// 2. Constructor para el encapsulamiento 
		public Direccion(String calle, String colonia, String ciudad, int codigoPpostal) {
			super();
			Calle = calle;
			Colonia = colonia;
			Ciudad = ciudad;
			CodigoPpostal = codigoPpostal;
		}//constructor

		//3. Metodos Getters y Setters
		
		public String getCalle() {
			return Calle;
		}//getCalle


		public void setCalle(String calle) {
			Calle = calle;
		}//setCalle


		public String getColonia() {
			return Colonia;
		}//getColonia


		public void setColonia(String colonia) {
			Colonia = colonia;
		}//setColonia


		public String getCiudad() {
			return Ciudad;
		}//getCiudad


		public void setCiudad(String ciudad) {
			Ciudad = ciudad;
		}//SetCiudad


		public int getCodigoPpostal() {
			return CodigoPpostal;
		}//getCodigoPostal


		public void setCodigoPpostal(int codigoPpostal) {
			CodigoPpostal = codigoPpostal;
		}//SetCodigoPostal

		@Override
		public String toString() {
			return "Direccion [Calle=" + Calle + ", Colonia=" + Colonia + ", Ciudad=" + Ciudad + ", CodigoPpostal="
					+ CodigoPpostal + "]";
		}//toString
		
	
		
		
}//class direccion 
