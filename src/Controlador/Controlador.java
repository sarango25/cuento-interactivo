package Controlador;

import Modelo.Logica;
import processing.core.PApplet;
import processing.core.PImage;

public class Controlador {
	private Logica logica;

	public Controlador(PImage[] imagenes, PApplet app) {
		logica = new Logica(imagenes, app);
	}

}
