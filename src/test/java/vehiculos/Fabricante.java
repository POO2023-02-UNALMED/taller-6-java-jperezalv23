package vehiculos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Fabricante{
	String nombre;
	Pais pais;
	public static HashMap<Fabricante, Integer> fabricantes = new HashMap<Fabricante, Integer>();
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.put(this, 0);
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		return Collections.max(fabricantes.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
	
}
