package proyecto4;

public class TestIntegerSet {

	public static void main(String[] args) {
		//Proyecto 4 
		//Crear una clase con un objeto que pueda lamacenar numeros enteros
		IntegerSet Conjunto = new IntegerSet();
		int [] ConjuntoArreglo = {200,1, 503, 5, 608, 4, 12, 88, 423, 789};
		int [] ConjuntoArreglo2 = {200,1, 503, 5, 608, 4, 12, 88, 423, 789};
		boolean [] ConjuntoBooleano = new boolean[10];
		boolean [] ConjuntoBooleano2 = new boolean[10];
		for (int i = 0; i < 10; i++) {
			if(ConjuntoArreglo [i] < 100 && ConjuntoArreglo [i]> 0) {
				ConjuntoBooleano [i] = true;
			}else {
				ConjuntoBooleano [i] = false;
			}
			if(ConjuntoArreglo2 [i] < 100 && ConjuntoArreglo2 [i]> 0) {
				ConjuntoBooleano2 [i] = true;
			}else {
				ConjuntoBooleano2 [i] = false;
			}
			
		}//For
		//Uso del Setter para mandar llamar a los metodos 
		Conjunto.setConjuntoBooleano(ConjuntoBooleano);
		boolean [] UnionConjuntos = Conjunto.Union(ConjuntoBooleano, ConjuntoBooleano2);
	}//main

}//class
