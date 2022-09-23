package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String color , boolean estado) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorPiel = color;
		venenoso = estado;
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas ++;
		listado.add(new Anfibio(nombre, edad, "selva", genero, "rojo" , true));
		return new Anfibio(nombre, edad, "selva", genero, "rojo" , true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras ++;
		listado.add(new Anfibio(nombre, edad, "selva", genero, "negro y amarillo" , false));
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo" , false);
	}
	
	public void setColorPiel(String color) {
		colorPiel = color;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean estado) {
		venenoso = estado;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
}
