package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		this(null,-1,null,null,null,-1);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String color, int largo) {
		super(nombre,edad,habitat,genero);
		colorEscamas = color;
		largoCola = largo;
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas ++;
		listado.add(new Reptil(nombre, edad, "humedal", genero, "verde", 3));
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes ++;
		listado.add(new Reptil(nombre, edad, "jungla", genero, "blanco", 1));
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largo) {
		largoCola = largo;
	}
	
	public int getLargoCola() {
		return largoCola;
	}

}
