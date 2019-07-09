package model;



import java.awt.Image;

import javax.swing.ImageIcon;

public class Player2
{
	
	public int posX = 100;
	public int posY = 300;
	 public Image image;
	 
	 /**
	  * @author FEUKENG
	  */
	 
	 
	 public Player2()
	 {
		image = (new ImageIcon("fond.jpg")).getImage();
	 }
	


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
