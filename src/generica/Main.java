package generica;

import excepciones.Alumno;

public class Main
{

	public static void main(String[] args)
	{
		String cadena1 = "aaaa";
		String cadena2 = "bbbb";

		ClaseGenerica<String> claseGenerica = new ClaseGenerica<String>(cadena1, cadena2);

		claseGenerica.intercambiaAB();
		System.out.println("La clase genérica se ha instanciado con :" + claseGenerica.nombreClase());
   
		System.out.println("Contenido de A: " + claseGenerica.getA());
		System.out.println("Contenido de B: " + claseGenerica.getB());

		Integer a = 1;
		Integer b = 2;
		ClaseGenerica<Integer> claseGenerica2 = new ClaseGenerica<Integer>(a, b);
		System.out.println("Contenido de A: " + claseGenerica2.getA());
		System.out.println("Contenido de B: " + claseGenerica2.getB());

		Alumno alumno1 = new Alumno("pepe", 29);
		Alumno alumno2 = new Alumno("juan", 20);
		ClaseGenerica<Alumno> claseGenerica3 = new ClaseGenerica<Alumno>(alumno1, alumno2);

		System.out.println("Alumno 1:" + claseGenerica3.getA().getNombre());
		System.out.println("Alumno 2:" + claseGenerica3.getB().getNombre());

		System.out.println("La clase genérica se ha instanciado con :" + claseGenerica3.nombreClase());

	}

}
