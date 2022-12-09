package prueba_default;
import clases.*;

public class TestAuto {
	public static void main(String[] args) {
		Automovil Vocho = new Automovil ("Santa Rosa", "Santa Rosa del Valle", "Guadalajara", 45590, "Juan M","MOCJ953007R238JL" ,
				"MOCJ953007R23", 300795, "Vocho", "Azul", 1978, "Volkwagen", "4 llantas",
				"Juan", 4, 0, "4 Puertas", false, 4,
				false, 0, true);
		
		System.out.println(Vocho);
		Vocho.Aceleracion();
		Vocho.Aceleracion();
		Vocho.Aceleracion();
		Vocho.Aceleracion();
		Vocho.Freno();
		Vocho.CambiarMarcha(1);
		Vocho.CambiarMarcha(2);
		Vocho.CambiarMarcha(3);
		Vocho.CambiarMarcha(4);
		//Vocho.CambiarMarcha(-1); // Comentado para que no interfiera con reducir marcha
		
		Vocho.ReducirMarcha(0);
		
		Vocho.Autonomia(2,3); 
		
		Vocho.Combustible(20);
		
		
		
		
	}	//class
}//main
