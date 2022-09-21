package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String color) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorPlumas = color;
	}
	
	public static int cantidadAves() {
		return halcones + aguilas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static void crearHalcon(String nombre, int edad, String genero) {
		halcones ++;
		new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static void crearAguila(String nombre, int edad, String genero) {
		aguilas ++;
		new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public void setColorPlumas(String color) {
		colorPlumas = color;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}

}
