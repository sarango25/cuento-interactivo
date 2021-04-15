package Modelo;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Leon extends Elemento {

	private PImage leones[];
	private int estado;

	public Leon(int posX, int posY, PImage leones[], PApplet app) {
		super(posX, posY, app);
		this.leones = leones;
		estado = 0;

	}

	public void activar(int activar) {
		estado = activar;
	}

	@Override
	public void pintar() {
		getApp().imageMode(PConstants.CENTER);

		getApp().image(leones[estado], getPosX(), getPosY());

		getApp().imageMode(PConstants.CORNER);
	}

	@Override
	public void movElemento(int posX, int posY, int posImg) {
		setPosX(posX);
		setPosY(posY);
		estado = posImg;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
