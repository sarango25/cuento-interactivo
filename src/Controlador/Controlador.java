package Controlador;

import Modelo.Logica;
import processing.core.PApplet;
import processing.core.PImage;

public class Controlador {
	private Logica logica;

	public Controlador(PImage[] imagenes, String[] cuento, PApplet app) {
		logica = new Logica(imagenes, cuento, app);
	}

	public void fondos() {
		logica.fondos();
	}

	public void cambiarPantalla() {
		logica.cambiarPantalla();
	}

}
