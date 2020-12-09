package org.iesalandalus.programacion.alfilajedrez;

import java.util.Scanner;

public class MainApp {

	private static Alfil alfil;

	public static void main(String[] args) {

		int opcionMenu = 0;

		do {
			mostrarMenu();
			opcionMenu = elegirOpcion();
			ejecutarOpcion(opcionMenu);

		} while (opcionMenu != 5);
	}

	private static void mostrarAlfil() {
		if(alfil != null)
			System.out.println(alfil);
		else
			System.out.println("Alfil sin datos");
	}

	private static void mostrarMenu() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1.- Crear alfil por defecto");
		System.out.println("2.- Crear un alfil de un color");
		System.out.println("3.- Crar un alfil en un color y columna inicial");
		System.out.println("4.- Mover el alfil");
		System.out.println("5.- Salir");
	}

	private static int elegirOpcion() {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		do {
			try {
				opcion = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("La opción no es válida");
				scanner.nextLine();
			}
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}

	private static void ejecutarOpcion(int opcionMenu) {
		switch (opcionMenu) {
		case 1:
			crearAlfilPorDefecto();
			mostrarAlfil();
			break;
		case 2:
			crearAlfilColor();
			mostrarAlfil();
			break;
		case 3:
			crearAlfinColorColumna();
			mostrarAlfil();
			break;
		case 4:
			mover();
			mostrarAlfil();
			break;
		}
	}

	private static void crearAlfilPorDefecto() {
		alfil = new Alfil();
	}

	private static void crearAlfilColor() {
		Color color = elegirColor();
		alfil = new Alfil(color);

	}

	private static Color elegirColor() {
		System.out.println("Elige color blanco 1 o negro 2");
		int opcion = elegirOpcion();
		if (opcion == 1)
			return Color.BLANCO;
		return Color.NEGRO;
	}

	private static void crearAlfinColorColumna() {
		Color color = elegirColor();
		char columnaInicial = elegirColumnaInicial();
		alfil = new Alfil(color, columnaInicial);
	}

	private static char elegirColumnaInicial() {
		System.out.println("Elige columna entre c y f");
		Scanner scanner = new Scanner(System.in);
		char caracter;
		do {
			caracter = scanner.next().charAt(0);
			if (caracter != 'c' && caracter != 'f') {
				System.out.println("Opción no válida. Opción entre c y f");
			}
		} while (caracter != 'c' && caracter != 'f');
		return caracter;
	}

	private static void mover() {
		mostrarMenuDirecciones();
		Direccion direccion = elegirDireccion();
		System.out.println("Escoge el número de pasos:");
		int numeroPasos = elegirPasos();
		try {
			alfil.mover(direccion, numeroPasos);
		} catch (NullPointerException e) {
			System.out.println("No has creado el alfil");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void mostrarMenuDirecciones() {
		System.out.println("Menu direcciones");
		System.out.println("1.- Arriba derecha");
		System.out.println("2.- Arriba izquierda");
		System.out.println("3.- Abajo derecha");
		System.out.println("4.- Abajo izquierda");
	}

	private static Direccion elegirDireccion() {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		do {
			try {
				opcion = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("La opción no es válida");
				scanner.nextLine();
			}
		} while (opcion < 1 || opcion > 4);
		Direccion retorno = null;
		switch (opcion) {
		case 1:
			retorno = Direccion.ARRIBA_DERECHA;
			break;
		case 2:
			retorno = Direccion.ARRIBA_IZQUIERDA;
			break;
		case 3:
			retorno = Direccion.ABAJO_DERECHA;
			break;
		case 4:
			retorno = Direccion.ABAJO_IZQUIERDA;
		}
		return retorno;
	}

	private static int elegirPasos() { /* este metodo no sale en el esquema */
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		do {
			try {
				opcion = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("La opción no es válida");
				scanner.nextLine();
			}
		} while (opcion < 1 || opcion > 7);
		return opcion;
	}

}
