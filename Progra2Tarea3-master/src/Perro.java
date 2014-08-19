
public class Perro extends Animal //heredamos la clase animal que es nuestra clase principal
{
String ladrar;//declaramos nuestra variable ladrar
	
	Perro(String nombre, int edad)
	{
		super(nombre, edad);//usamos funcion super para poder llamar las variables de nuestra clase principal Animal 
		 
	}
	
	String ladrar()//retornamos ladrar
	{
		return ladrar;
	}
	
	
}
