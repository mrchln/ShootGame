package com.hfqs.shoot;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected int x;//×ø±êx
	protected int y;//×ø±êy
	protected int width;//¿í
	protected int height;//¸ß
	protected BufferedImage image;//Í¼Æ¬
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int y) {
		this.y = y;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
}
