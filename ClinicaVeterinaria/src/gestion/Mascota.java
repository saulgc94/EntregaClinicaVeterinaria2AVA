package gestion;

import java.io.Serializable;

public class Mascota extends Animales implements Serializable, InterfazAnimal{

	private String nombre;
    private Persona duenyo;

    public Mascota(long ID, String nombre, int edad, String raza, Persona duenyo) {
    	this.setID(ID);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Due�o: " + duenyo.toString());
    }

	@Override
	public boolean repira() {
		//aqu� vendr�a el c�digo para la respiraci�n
		return true;
	}

	@Override
	public boolean come(float cantidad) {
		//aqu� vendr�a el c�digo para ver lo que comen
		return true;
		
	}
}