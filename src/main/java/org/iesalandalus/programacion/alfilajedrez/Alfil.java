package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	public  Color color;
	public Posicion posicion;
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException ("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new IllegalArgumentException("La posición no puede ser nula.");
		}
		this.posicion = posicion;
	}
}
