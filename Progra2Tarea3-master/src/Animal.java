
//en este ejercicio me guie usando los ejercicios vistos en clase de padre e hijo

public class Animal //empezamos creando clase animal como la clase principal
{
	String nombre;//declaramos las variables nombre y edad que son las que utilizamos
	int edad;
	
	Animal(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		
	}
	//retornamos el nombre y edad del animal
	String getNombre() 
	{
		return nombre;
	}
	
	int getEdad() 
	{
		return edad;
	}
	//damos el nombre y edad del animal
	void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	void setEdad(int edad)
	{
		this.edad = edad;
	}

}
