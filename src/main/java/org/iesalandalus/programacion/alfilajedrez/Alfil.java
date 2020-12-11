package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	private Color color;
	private Posicion posicion;

	public Alfil() {

		setColor(color.NEGRO);
		posicion = new Posicion(8, 'f');

	}

	public Alfil(Color color) {
		setColor(color);

		if (color == Color.BLANCO) {

			posicion = new Posicion(1, 'f');
		}
		if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'f');
		}
	}

	public Alfil(Color color, char columnaInicial) {
		setColor(color);

		if (columnaInicial != 'c' && columnaInicial != 'f') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, columnaInicial);
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, columnaInicial);
		}

	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) throws IllegalArgumentException {
		if (color == null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
		}
		this.color = color;

	}

	public Posicion getPosicion() {
		return posicion;
	}

	public Posicion setPosicion() {
		return posicion;
	}

	public void mover(Direccion direccion,int pasos) throws IllegalArgumentException {
		
		if (direccion == null) {
			throw new IllegalArgumentException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos <=0) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
		}
	
		
	
		int fila = 0;
		char columna;
		
		switch (direccion) {
		case ARRIBA_DERECHA:
			fila = posicion.getFila() + pasos;
			columna = (char) ((int) posicion.getColumna() + pasos);
			posicion = new Posicion(fila, columna);

			break;
		case ABAJO_DERECHA:
			fila = posicion.getFila() - pasos;

			columna = (char) ((int) posicion.getColumna() + pasos);
			posicion = new Posicion(fila, columna);

			break;
		case ABAJO_IZQUIERDA:
			fila = posicion.getFila() - pasos;

			columna = (char) ((int) posicion.getColumna() - pasos);
			posicion = new Posicion(fila, columna);

			break;
		case ARRIBA_IZQUIERDA:
			fila = posicion.getFila() + pasos;

			columna = (char) ((int) posicion.getColumna() - pasos);
			posicion = new Posicion(fila, columna);

			break;
		default:
			break;
		}
}
		
		
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (posicion == null && other.posicion != null) {
			return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return posicion + ", color=" + color;
	}

}
