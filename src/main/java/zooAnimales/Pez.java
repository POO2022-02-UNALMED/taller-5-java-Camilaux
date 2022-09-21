package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String color, int aletas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorEscamas = color;
		cantidadAletas = aletas;
	}
	
	public static int cantidadPeces() {
		return salmones + bacalaos;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones ++;
		listado.add(new Pez(nombre, edad, "oceano", genero, "rojo", 6));
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos ++;
		listado.add(new Pez(nombre, edad, "oceano", genero, "gris", 6));
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public void setColorEscamas(String color) {
		colorEscamas =color;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int cantidad) {
		cantidadAletas = cantidad;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}

}
