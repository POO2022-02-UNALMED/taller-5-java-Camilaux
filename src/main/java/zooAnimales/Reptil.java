package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String color, int largo) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		colorEscamas = color;
		largoCola = largo;
	}
	
	public static int cantidadReptiles() {
		return iguanas + serpientes;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		iguanas ++;
		new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public void crearSerpiente(String nombre, int edad, String genero) {
		serpientes ++;
		new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
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
