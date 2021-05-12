package gestion;

import java.io.Serializable;

public class Animal {

	private long ID;
	protected int edad;
	protected String raza;

	public Animal() {
		super();
	}

	public int getEdad() {
	    return edad;
	}

	public void setEdad(int edad) {
	    this.edad = edad;
	}

	public String getRaza() {
	    return raza;
	}

	public void setRaza(String raza) {
	    this.raza = raza;
	}

	private long getID() {
		return ID;
	}

	protected void setID(long iD) {
		this.ID = iD;
	}

}