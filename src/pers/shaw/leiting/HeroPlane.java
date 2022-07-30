package pers.shaw.leiting;

import java.awt.Image;

import javax.swing.ImageIcon;

public class HeroPlane extends Thread {
	int x,y;
	int width = 40, height = 40;
	int speed = 10;
	boolean up,down,left,right;
	Image img = new ImageIcon("img/10011.png").getImage();
	public HeroPlane(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public HeroPlane() {
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(up) {
				y -= speed;
				if(y<0) y=0;
			}
			if(down) {
				y += speed;
				if(y>728) y = 728;
			}
			if(left) {
				x -= speed;
				if(x<0) x=0;
			}
			if(right) {
				x += speed;
				if(x>472) x=472;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
