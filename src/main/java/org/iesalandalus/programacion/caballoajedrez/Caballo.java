package org.iesalandalus.programacion.caballoajedrez;

public class Caballo {
	private Color color;
	private Posicion posicion;
	
	public Caballo() {
		posicion = new Posicion(8, 'b');
	}
	
	public Caballo(Color color) {
		this.color = color;
		switch(color) {
		case BLANCO:
			posicion = new Posicion(1, 'b');
			break;
		case NEGRO:
			posicion = new Posicion(8, 'b');
		}
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	
}
