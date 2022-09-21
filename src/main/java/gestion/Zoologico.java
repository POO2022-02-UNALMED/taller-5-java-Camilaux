package gestion;

import java.util.ArrayList;

public class Zoologico {
	private static String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nom, String ubi) {
		nombre = nom;
		ubicacion = ubi;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);	
	}
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for (int i = 0; i < zonas.size(); i++) {
			cantidad += zonas.get(i).cantidadAnimales(); 
		}
		return cantidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
}
