
public class Loro extends Animal//heredamos la clase animal que es nuestra clase principal
{
	String hablar;//declaramos nuestra variable maullar
	
	Loro(String nombre, int edad)
	{//usamos funcion super para poder llamar las variables de nuestra clase principal Animal
		super(nombre, edad);
	}
	
	String hablar()//retornamos hablar
	{
		return hablar;
	}

}
