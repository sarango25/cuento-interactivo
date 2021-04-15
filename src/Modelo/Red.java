package Modelo;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Red extends Elemento {

	private PImage red[];
	private boolean estado;
	private boolean pintar;
	private int posImg;

	public Red(int posX, int posY, PImage red[], PApplet app) {
		super(posX, posY, app);
		this.red = red;
		estado = false;
		pintar = false;
		posImg = 0;
	}

	public void activar(boolean activar) {
		estado = activar;
	}

	@Override
	public void pintar() {
		if (pintar) {
			
			getApp().imageMode(PConstants.CENTER);

			if (estado == false) {
				getApp().image(red[posImg], getPosX(), getPosY());
			} else {
				if ((getApp().millis() / 1000) % 2 == 0) {

					getApp().image(red[posImg + 1], getPosX(), getPosY());
				} else {
					getApp().image(red[posImg], getPosX(), getPosY());
				}
			}

			getApp().imageMode(PConstants.CORNER);
		}

	}

	@Override
	public void movElemento(int posX, int posY, int posImg) {
		// TODO Auto-generated method stub

	}

	public boolean isPintar() {
		return pintar;
	}

	public void setPintar(boolean pintar) {
		this.pintar = pintar;
	}
	

}