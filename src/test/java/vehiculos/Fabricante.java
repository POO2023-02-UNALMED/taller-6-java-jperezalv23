package vehiculos;

public class Fabricante{
	String nombre;
	Pais pais;
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		
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
	
}
