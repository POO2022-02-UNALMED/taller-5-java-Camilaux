package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>() ;
	
	public Animal() {
		this(null,0,null,null);
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales ++;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		String texto = "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: " + Ave.cantidadAves() +
				"\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces() +
				"\n" + "Anfibios: " + Anfibio.cantidadAnfibios();
		return texto;
	}
	
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales += totalAnimales;
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public ArrayList<Zona> getZona() {
		return zona;
	}
	
	public String toString() {
		if(getZona().size() != 0) {
			String cadena = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
					" y mi genero es " + genero + ", la zona en la que me ubico es " + getZona() + ", en el " + getNombre();
			return cadena;
		}
		else {
			String cadena = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
					" y mi genero es " + genero;
			return cadena;
		}
	}

}
