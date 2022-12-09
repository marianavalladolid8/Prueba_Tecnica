package proyecto3;
public class Empleado {
	//Proyecto 3 Empleado
	// Se declaran las siguientes Variables
	// 1. Atributos
	public String Nombre;
	public String Apellido;
	public double SalarioMensual;
	public int histemp;
	
	
//2.Constructor
	public Empleado(String nombre, String apellido, double salarioMensual) {
		super();
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.SalarioMensual = salarioMensual;
		this.histemp+=1;
	}//constructor

//3.Métodos Getters y Setters
	public String getNombre() {
		return Nombre;
	}//getnombre


	public void setNombre(String nombre) {
		Nombre = nombre;
	}//setnombre


	public String getApellido() {
		return Apellido;
	}//getAppellido


	public void setApellido(String apellido) {
		Apellido = apellido;
	}//setapellido


	public double getSalarioMensual() {
		return SalarioMensual;
	}//getSalario


	public void setSalarioMensual(double salarioMensual) {
		SalarioMensual = salarioMensual;
	}//setsalario

	//Métodos varios
	public void salario(){
	    System.out.println("Tu salario es de : " + this.SalarioMensual + " pesitos");
	}// Metodo para saber el salario mensual actual
	
	public void aumentoS(double aumento){
    SalarioMensual = SalarioMensual+SalarioMensual* aumento;
    System.out.println("Tu salario ha aumentado a: " + SalarioMensual + " pesitos");
}//Metodo para saber le aumento de salario
	
	public void anual(){
	    System.out.println("Tu salario anual es  : " + this.SalarioMensual *12 + " pesitos");
	}//Metodo para saber el salario anual con el aumento.
	
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", Apellido=" + Apellido + ", SalarioMensual=" + SalarioMensual + "]";
	}//toString

		
	}//class