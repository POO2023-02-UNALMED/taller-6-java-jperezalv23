package vehiculos;
import java.io.*;
import java.util.*;

public class Pais {
	String nombre;
	public static HashMap<String, Integer> paises = new HashMap<String, Integer>();
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.put(nombre, 0);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String paisMasVendedor() {
		return Collections.max(paises.entrySet(), Map.Entry.comparingByValue()).getKey();
	}

}
