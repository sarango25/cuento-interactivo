package Modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	PImage fin, fondo1, fondo2, home1, home1_1, leon1, leon2, leon3, leon4, leon5, raton1, raton2, raton2_1, raton3,
			raton3_1, raton4, red1, red1_1, texto1, texto1_1, texto2, texto2_1, texto3, texto3_1, texto4, texto4_1;
	PImage[] imagenes = new PImage[25];
	private PApplet app;
	int pantalla;


	public Logica(PImage[] imagenes, PApplet app) {

		this.imagenes = imagenes;
		this.app = app;

		fin = imagenes[0];
		fondo1 = imagenes[1];
		fondo2 = imagenes[2];
		home1 = imagenes[3];
		home1_1 = imagenes[4];
		leon1 = imagenes[5];
		leon2 = imagenes[6];
		leon3 = imagenes[7];
		leon4 = imagenes[8];
		raton1 = imagenes[9];
		raton2 = imagenes[10];
		raton2_1 = imagenes[11];
		raton3 = imagenes[12];
		raton3_1 = imagenes[13];
		raton4 = imagenes[14];
		red1 = imagenes[15];
		red1_1 = imagenes[16];
		texto1 = imagenes[17];
		texto1_1 = imagenes[18];
		texto2 = imagenes[19];
		texto2_1 = imagenes[20];
		texto3 = imagenes[21];
		texto3_1 = imagenes[22];
		texto4 = imagenes[23];
		texto4_1 = imagenes[24];

		pantalla = 0;
	}

	public void fondos() {

		switch (pantalla) {
		case 0:
			app.image(home1, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				app.image(home1_1, 0, 0);
			}
			break;

		case 1:
			app.image(texto1, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				app.image(texto1_1, 0, 0);
			}
			break;

		case 2:
			app.image(fondo1, 0, 0);
			
			break;

		case 3:
			app.image(texto2, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				app.image(texto2_1, 0, 0);
			}
			break;

		case 4:
			app.image(texto3, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				app.image(texto3_1, 0, 0);
			}
			break;

		case 5:
			app.image(texto4, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				app.image(texto4_1, 0, 0);
			}
			break;
			
		case 6:
			app.image(fondo2, 0, 0);
			
			break;
			
		case 7:
			app.image(fin, 0, 0);
			
			break;

		}

	}
	public void cambiarPantalla() {
		switch (pantalla) {

		case 0:
			app.image(home1, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				pantalla = 1;
			}
			break;

		case 1:
			app.image(texto1, 0, 0);

			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				pantalla = 2;
			}

			break;

		}
	}


	
}
