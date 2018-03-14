package com.hfqs.shoot;
/**
 * 敌飞机：是飞行物，也是敌人
 * @author hanfuqingshi
 *
 */
public class Airplane extends FlyingObject implements Enemy{
	private int speed = 2;
	
	public int getScore() {
		return 0;
	}
	
}
