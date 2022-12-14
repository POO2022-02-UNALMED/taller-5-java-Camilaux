package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		this(null,-1,null,null,null);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String color) {
		super(nombre,edad,habitat,genero);
		colorPlumas = color;
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones ++;
		listado.add(new Ave(nombre, edad, "montanas", genero, "cafe glorioso"));
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas ++;
		listado.add(new Ave(nombre, edad, "montanas", genero, "blanco y amarillo"));
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public void setColorPlumas(String color) {
		colorPlumas = color;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}

}
