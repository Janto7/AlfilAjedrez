package org.iesalandalus.programacion.alfilajedrez;



public class Alfil {
	private Color color;
	private Posicion posicion;
	private static final String COLOR_NO_ESPERADO = "El color no es el esperado.";
	
	
	
	
	public Alfil() {
		
		color = Color.NEGRO;
		posicion = new Posicion(8, 'f');
		
	}
	public Alfil(Color color) {
		if (color==Color.BLANCO) {
			posicion = new Posicion(1, 'f');	
		}
		if (color==Color.NEGRO) {
			posicion = new Posicion(8, 'f');
		}
	}
	public Alfil(Color color,char posicion) {
		if (posicion != 'f' || posicion != 'c'){
			throw new IllegalArgumentException("ERROR:La columna tiene que ser valida.");
		}else { 
			if (color==Color.BLANCO) {
				new Alfil(Color.BLANCO, 'c');
			if (color==Color.NEGRO) {
				new Alfil(Color.NEGRO, 'f');
			 }
		   }
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
