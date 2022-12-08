package prueba_default;
import clases.*;

public class TestAuto {
	public static void main(String[] args) {
		Automovil Vocho = new Automovil ("Bocho","Azul",1978,"Volkwagen","4 Llantas", "Juan", 100, 0, "2 Puertas",false, 4, false);
		
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
		//Vocho.CambiarMarcha(-1);
		
		Vocho.ReducirMarcha();
		
		
		
	}	//class
}//main
