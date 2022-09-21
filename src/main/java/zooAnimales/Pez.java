package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private ArrayList<Pez> listado;
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
	
	public void crearSalmon(String nombre, int edad, String genero) {
		salmones ++;
		new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public void crearBacalao(String nombre, int edad, String genero) {
		bacalaos ++;
		new Pez(nombre, edad, "oceano", genero, "gris", 6);
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
