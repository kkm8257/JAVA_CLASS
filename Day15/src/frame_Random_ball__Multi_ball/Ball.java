package frame_Random_ball__Multi_ball;

import java.awt.Color;

public class Ball {

	
	
	private int posX ;
	private int posY ;
	private int speedX ;
	private int speedY ;
	
	private int size;
	private Color color;
	
	
	
	public Ball(int posX, int posY, int speedX, int speedY, int size, Color color) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.speedX = speedX;
		this.speedY = speedY;
		this.size = size;
		this.color = color;
	}



	
	public void setPosX(int posX) {
		this.posX = posX;
	}




	public void setPosY(int posY) {
		this.posY = posY;
	}




	public int getPosX() {
		return posX;
	}




	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}




	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}




	public int getPosY() {
		return posY;
	}




	public int getSpeedX() {
		return speedX;
	}




	public int getSpeedY() {
		return speedY;
	}




	public int getSize() {
		return size;
	}




	public Color getColor() {
		return color;
	}




	public void move() {
		
		//��ü���⿡�� �������� �޼ҵ�� �����
		//�ʵ�� �����ڷ�
		
		posX+=speedX;
		posY+=speedY;
		
		
		
	}
	
	
	
	
}
