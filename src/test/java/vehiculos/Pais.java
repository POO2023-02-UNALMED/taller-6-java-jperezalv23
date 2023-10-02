package vehiculos;
import java.io.*;
import java.util.*;

public class Pais {
	String nombre;
	public static HashMap<Pais, Integer> paises = new HashMap<Pais, Integer>();
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.put(this, 0);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Pais paisMasVendedor() {
		return Collections.max(paises.entrySet(), Map.Entry.comparingByValue()).getKey();
	}

}
