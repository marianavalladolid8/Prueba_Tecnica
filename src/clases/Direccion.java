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

		//3. Metodos 
		
		public String getCalle() {
			return Calle;
		}


		public void setCalle(String calle) {
			Calle = calle;
		}


		public String getColonia() {
			return Colonia;
		}


		public void setColonia(String colonia) {
			Colonia = colonia;
		}


		public String getCiudad() {
			return Ciudad;
		}


		public void setCiudad(String ciudad) {
			Ciudad = ciudad;
		}


		public int getCodigoPpostal() {
			return CodigoPpostal;
		}


		public void setCodigoPpostal(int codigoPpostal) {
			CodigoPpostal = codigoPpostal;
		}

		@Override
		public String toString() {
			return "Direccion [Calle=" + Calle + ", Colonia=" + Colonia + ", Ciudad=" + Ciudad + ", CodigoPpostal="
					+ CodigoPpostal + "]";
		}//toString
		
	
		
		
}//class direccion 
