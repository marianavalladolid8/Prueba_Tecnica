package prueba_default;

import clases.Marca;

public class TestMarca {

	public static void main(String[] args) {
		// Un nueva clase con con 5 nuevos parametros
		Marca Coche = new Marca ("Santa Rosa", "Santa Rosa del Valle", "Guadalajara", 45590, "Juan M","MOCJ953007R238JL" ,
				"MOCJ953007R23", 300795, "Vocho", "Azul", 1978, "Volkwagen", "4 llantas",
				"Juan", 4, 0, "4 Puertas", false, 4,
				false, 0, true,"Volkwagen","Vocho", 60, 1975, 06);
		
			System.out.println(Coche);
	}//void

}//Class
