package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private static int totalMamifero;
	private static int totalAve;
	private static int totalAnfibio;
	private static int totalReptil;
	private static int totalPez;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<>() ;
	
	public Animal() {
		
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
		String texto = "Mamiferos: " + getTotalMamifero() + "\n" + "Aves: " + getTotalAve() +
				"\n" + "Reptiles: " + getTotalReptil() + "\n" + "Peces: " + getTotalPez() +
				"\n" + "Anfibios: " + getTotalAnfibio();
		return texto;
	}
	
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
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
	
	public static void setTotalMamifero(int n) {
		Animal.totalMamifero += n;
	}
	
	public static void setTotalAnfibio(int n) {
		Animal.totalAnfibio += n;
	}
	
	public static void setTotalAve(int n) {
		Animal.totalAve += n;
	}
	
	public static void setTotalPez(int n) {
		Animal.totalPez += n;
	}
	
	public static void setTotalReptil(int n) {
		Animal.totalReptil += n;
	}
	
	public static int getTotalReptil() {
		return totalReptil;
	}
	
	public static int getTotalMamifero() {
		return totalMamifero;
	}
	
	public static int getTotalAve() {
		return totalAve;
	}
	
	public static int getTotalPez() {
		return totalPez;
	}
	
	public static int getTotalAnfibio() {
		return totalAnfibio;
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
