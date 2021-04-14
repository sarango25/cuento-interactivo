package Vista;

import Controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	PImage fin, fondo1, fondo2, home1, home1_1, leon1, leon2, leon3, leon4, leon5, raton1, raton2, raton2_1, raton3,
			raton3_1, raton4, red1, red1_1, texto1, texto1_1, texto2, texto2_1, texto3, texto3_1, texto4, texto4_1;

	PImage[] imagenes = new PImage[25];

	private String[] cuento;
	private Controlador controlador;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(1366, 768);
	}

	public void setup() {

		fin = loadImage("Imagenes/Final.png");
		fondo1 = loadImage("Imagenes/Fondo_1.png");
		fondo2 = loadImage("Imagenes/Fondo_2.png");
		home1 = loadImage("Imagenes/Home_1.png");
		home1_1 = loadImage("Imagenes/Home_1.1.png");
		leon1 = loadImage("Imagenes/Leon_1.png");
		leon2 = loadImage("Imagenes/Leon_2.png");
		leon3 = loadImage("Imagenes/Leon_3.png");
		leon4 = loadImage("Imagenes/Leon_4.png");
		raton1 = loadImage("Imagenes/Raton_1.png");
		raton2 = loadImage("Imagenes/Raton_2.png");
		raton2_1 = loadImage("Imagenes/Raton_2.1.png");
		raton3 = loadImage("Imagenes/Raton_3.png");
		raton3_1 = loadImage("Imagenes/Raton_3.1.png");
		raton4 = loadImage("Imagenes/Raton_4.png");
		red1 = loadImage("Imagenes/Red_1.png");
		red1_1 = loadImage("Imagenes/Red_1.1.png");
		texto1 = loadImage("Imagenes/Texto_1.png");
		texto1_1 = loadImage("Imagenes/Texto_1.1.png");
		texto2 = loadImage("Imagenes/Texto_2.png");
		texto2_1 = loadImage("Imagenes/Texto_2.1.png");
		texto3 = loadImage("Imagenes/Texto_3.png");
		texto3_1 = loadImage("Imagenes/Texto_3.1.png");
		texto4 = loadImage("Imagenes/Texto_4.png");
		texto4_1 = loadImage("Imagenes/Texto_4.1.png");

		cuento = loadStrings("Data/El leon y el raton.txt");

	

		controlador = new Controlador(imagenes, this);
	}

	public void draw() {
		
		background(0);

	}

}
