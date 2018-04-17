import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
import java.lang.Runtime;

public class Municipio implements Serializable {

	protected String nombre;

	public Municipio() {
		this.nombre = "";
	}

	public Municipio(String g_nombre) {
		this.nombre = g_nombre;
	}

	public void setNombre(String g_nombre) {this.nombre = g_nombre;}
	public String getNombre() {return this.nombre;}
}