package pers.shaw.leiting;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bullet extends Thread{
	int x,y;
	static int width = 20, height = 20;
	int speed = 10;
	boolean alive = true;
	Image img = new ImageIcon("img/30024.png").getImage();
	
	public Bullet(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(alive) {
			y -= speed;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
