package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		this(null,-1,null,null,false, -1);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean estado, int patas) {
		super(nombre,edad,habitat,genero);
		pelaje = estado;
		this.patas = patas;
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos ++;
		listado.add(new Mamifero(nombre,edad,"pradera",genero,true,4));
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones ++;
		listado.add(new Mamifero(nombre,edad,"selva",genero,true,4));
		return new Mamifero(nombre,edad,"selva",genero,true,4);
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
	
	public boolean isPelaje() {
		return pelaje;
	}

}
