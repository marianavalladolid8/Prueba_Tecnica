package proyecto4;

import java.util.Arrays;

public class IntegerSet {
	//Proyecto 4 
	//1.Creacion de atributos
	boolean [] ConjuntoBooleano;
	boolean [] conjunto3;
	//2. Constructor

	public IntegerSet() {
		super();
		boolean [] ConjuntoBooleano = new boolean[10];
		Arrays.fill(ConjuntoBooleano, false);
		
		boolean [] conjunto3 = new boolean[10];
	}//Constructor

	//3.Métodos
	
	public boolean[] getConjuntoBooleano() {
		return ConjuntoBooleano;
	}//get

	public void setConjuntoBooleano(boolean[] conjuntoBooleano) {
		ConjuntoBooleano = conjuntoBooleano;
	}//set
	
	// Metodo de union 
	public boolean[] Union (boolean[] conjunto1, boolean[] conjunto2) {
		for (int i = 0; i < 10; i ++) {
			if (conjunto1 [i] == true || conjunto2[i] == true)
			conjunto3 [i] = true;
			else
				conjunto3 [i] = false;
		}//
		return conjunto3;
	}//
	
	public boolean[] Interseccion (boolean[] conjunto1, boolean[] conjunto2) {
		for (int i = 0; i < 10; i ++) {
			if (conjunto1 [i] == true && conjunto2[i] == true)
			conjunto3 [i] = true;
			else
				conjunto3 [i] = false;
		}//
		return conjunto3;
	}//

	//toString
	@Override
	public String toString() {
		return "IntegerSet [ConjuntoBooleano=" + Arrays.toString(ConjuntoBooleano) + "]";
	}//toString
	
}//class