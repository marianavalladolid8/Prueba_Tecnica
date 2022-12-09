
package proyecto3;


public class TestEmpleado {

	public static void main(String[] args) {
		//2 objetos de la clase Empleado
		Empleado empleados[] = new Empleado[2];
		empleados[0]= new Empleado("Mariana", "Valladolid",12.853);
		empleados[1]= new Empleado ("Juan", "Morales", 20.322);
		
		//Impime la informacion de cada uno
		System.out.println(empleados[0]);
		System.out.println(empleados[1]);
		
		//Solicitamos informacion del empleado
		empleados[0].salario();
		empleados[0].aumentoS(.1);
		empleados[0].anual();
		
		//Solicitamos informacion del empleado
		empleados[1].salario();
		empleados[1].aumentoS(.1);
		empleados[1].anual();
		
		//Para saber el numero de empleados con un arreglo
		int empleadoscontratados= empleados.length; 
		System.out.println("Empleados contratados : "+empleadoscontratados);
	}//void

}//class
