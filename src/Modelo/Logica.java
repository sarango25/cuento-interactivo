package Modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	PImage fin, fondo1, fondo2, home1, home1_1, leon1, leon2, leon3, leon4, leon5, raton1, raton2, raton2_1, raton3,
			raton3_1, raton4, raton4_1, red1, red1_1, texto1, texto1_1, texto2, texto2_1, texto3, texto3_1, texto4,
			texto4_1;
	PImage[] imagenes = new PImage[26];
	private PApplet app;
	private int pantalla;
	private int interaccion;
	private Raton raton;
	private Leon leon;
	private Red red;

	public Logica(PImage[] imagenes, PApplet app) {

		this.imagenes = imagenes;
		this.app = app;

		PImage imgRatones[] = new PImage[7];
		PImage imgLeones[] = new PImage[4];
		PImage imgRed[] = new PImage[2];

		fin = imagenes[0];
		fondo1 = imagenes[1];
		fondo2 = imagenes[2];
		home1 = imagenes[3];
		home1_1 = imagenes[4];
		imgLeones[0] = imagenes[5];
		imgLeones[1] = imagenes[6];
		imgLeones[2] = imagenes[7];
		imgLeones[3] = imagenes[8];
		imgRatones[0] = imagenes[9];
		imgRatones[1] = imagenes[10];
		imgRatones[2] = imagenes[11];
		imgRatones[3] = imagenes[12];
		imgRatones[4] = imagenes[13];
		imgRatones[5] = imagenes[14];
		imgRatones[6] = imagenes[15];
		imgRed[0] = imagenes[16];
		imgRed[1] = imagenes[17];
		texto1 = imagenes[18];
		texto1_1 = imagenes[19];
		texto2 = imagenes[20];
		texto2_1 = imagenes[21];
		texto3 = imagenes[22];
		texto3_1 = imagenes[23];
		texto4 = imagenes[24];
		texto4_1 = imagenes[25];

		raton = new Raton(0, 650, imgRatones, app);
		leon = new Leon(1045, 625, imgLeones, app);
		red = new Red(1045, 625, imgRed, app);

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
		red.pintar();

		if (!red.isPintar()) {
			leon.pintar();
		}

		raton.pintar();

	}

	public void cambiarPantalla() {
		// System.out.println("pantalla:"+pantalla);
		// System.out.println("interaccion:"+interaccion);
		switch (pantalla) {

		case 0:
			app.image(home1, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				pantalla = 1;
				raton.movElemento(250, 650, 1);
			}

			break;

		case 1:
			app.image(texto1, 0, 0);

			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				pantalla = 2;
				raton.activar(true);
			}
			break;

		case 2:
			app.image(fondo1, 0, 0);

			switch (interaccion) {

			case 0:
				if (169 < app.mouseX && app.mouseX < 334 && 569 < app.mouseY && app.mouseY < 733) {
					interaccion = 1;
					raton.activar(true);
					raton.movElemento(1227, 650, 1);

				}
				break;
			case 1:
				if (1140 < app.mouseX && app.mouseX < 1298 && 570 < app.mouseY && app.mouseY < 730) {
					interaccion = 2;
					raton.activar(true);
					raton.movElemento(950, 580, 3);

				}
				break;

			case 2:
				if (900 < app.mouseX && app.mouseX < 992 && 534 < app.mouseY && app.mouseY < 610) {
					interaccion = 3;
					raton.activar(true);
					raton.movElemento(1162, 435, 1);

				}
				break;

			case 3:
				if (1071 < app.mouseX && app.mouseX < 1257 && 354 < app.mouseY && app.mouseY < 523) {
					pantalla = 3;
					raton.activar(false);
					raton.movElemento(1075, 555, 1);
					leon.activar(1);
				}
				break;

			}

			break;

		case 3:
			app.image(texto2, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				pantalla = 4;
				leon.movElemento(1075, 555, 2);
				raton.setPintar(false);
			}

			break;

		case 4:
			app.image(texto3, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				pantalla = 5;
				red.setPintar(true);
				raton.setPintar(true);
				raton.movElemento(250, 650, 1);
			}

			break;

		case 5:
			app.image(fondo2, 0, 0);
			if (194 < app.mouseX && app.mouseX < 417 && 361 < app.mouseY && app.mouseY < 432) {
				pantalla = 6;
				interaccion = 0;
				red.activar(true);
			}

			break;

		case 6:

			switch (interaccion) {

			case 0:
				if (771 < app.mouseX && app.mouseX < 1290 && 434 < app.mouseY && app.mouseY < 767) {
					interaccion = 1;
					red.activar(false);
					raton.activar(true);
					raton.movElemento(1038, 615, 5);
				}
				break;

			case 1:
				if (1004 < app.mouseX && app.mouseX < 1125 && 557 < app.mouseY && app.mouseY < 683) {
					red.setPintar(false);
					raton.activar(false);
					leon.movElemento(1075, 555, 3);
					raton.setPintar(false);
					pantalla = 7;

				}
				break;
			}
		}
	}

}
