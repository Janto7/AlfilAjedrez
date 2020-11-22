package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	private Color color;
	private Posicion posicion;
	
	
	
	
	public Alfil() {
		
		color = color.NEGRO;
		posicion = new Posicion(8, 'f');
		
	}
	public Alfil(Color color) {
		if (color==color.BLANCO) {
			posicion = new Posicion(1, 'f');	
		}
		if (color==color.NEGRO) {
			posicion = new Posicion(8, 'f');
		}
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("ERROR:El color no puede ser nulo.");
		}
		this.color = color;

	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion==null) {
			throw new IllegalArgumentException("ERROR:La posición no puede ser nula.");
		}
		this.posicion = posicion;
	}

}
