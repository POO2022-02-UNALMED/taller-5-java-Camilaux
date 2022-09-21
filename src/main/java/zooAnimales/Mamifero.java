package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean estado, int patas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		pelaje = estado;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return caballos + leones;
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		caballos ++;
		new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		leones ++;
		new Mamifero(nombre,edad,"selva",genero,true,4);
	}
	
	public void setPelaje(boolean estado) {
		pelaje = estado;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return patas;
	}

}
