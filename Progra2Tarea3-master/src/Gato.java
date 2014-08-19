
public class Gato extends Animal//heredamos la clase animal que es nuestra clase principal
{
String maullar;//declaramos nuestra variable maullar
	
	Gato(String nombre, int edad)
	{
		super(nombre, edad);//usamos funcion super para poder llamar las variables de nuestra clase principal Animal 
	}
	
	String maullar()//retornamos maullar
	{
		return maullar;
	}

}
