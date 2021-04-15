package Modelo;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Raton extends Elemento {

	private PImage ratones[];
	private boolean estado;
	private boolean pintar;
	private int posImg;

	public Raton(int posX, int posY, PImage ratones[], PApplet app) {
		super(posX, posY, app);
		this.ratones = ratones;
		estado = false;
		pintar = true;
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
				getApp().image(ratones[posImg], getPosX(), getPosY());
			} else {
				if ((getApp().millis() / 1000) % 2 == 0) {

					getApp().image(ratones[posImg + 1], getPosX(), getPosY());
				} else {
					getApp().image(ratones[posImg], getPosX(), getPosY());
				}
			}

			getApp().imageMode(PConstants.CORNER);
		}

	}

	@Override
	public void movElemento(int posX, int posY, int posImg) {
		setPosX(posX);
		setPosY(posY);
		this.posImg = posImg;
	}

	public boolean isPintar() {
		return pintar;
	}

	public void setPintar(boolean pintar) {
		this.pintar = pintar;
	}

}
