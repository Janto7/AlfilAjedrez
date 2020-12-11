package org.iesalandalus.programacion.alfilajedrez;

import java.util.Scanner;

import utilidades.Entrada;

public class MainApp {

	private static Alfil alfil;

	public static void main(String[] args) {

		
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
}