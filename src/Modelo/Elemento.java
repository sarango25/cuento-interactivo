package Modelo;

import processing.core.PApplet;

public abstract class Elemento {

	private PApplet app;
	private int posX, posY;

	public Elemento(int posX, int posY, PApplet app) {

		this.posX = posX;
		this.posY = posY;
		this.app = app;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public abstract void movElemento(int posX,int posY,int posImg);

	public abstract void pintar();

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
