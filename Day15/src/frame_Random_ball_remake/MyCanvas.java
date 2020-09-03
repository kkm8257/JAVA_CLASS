package frame_Random_ball_remake;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class MyCanvas extends Canvas {
	Image bufferImage;
	Graphics buffg;

	
	//객체 지향적으로 재설계

	MoveLeftRight th1;
	Ball ball;
	
	
	public MyCanvas(int posX,int posY) {


		ball=new Ball(100,100,5,8,50,Color.BLACK);
		
		th1=new MoveLeftRight();
		th1.start();
		
	
		
		
	}

	@Override
	public void paint(Graphics g) {
		if (buffg == null) {
			bufferImage = createImage(getWidth(), getHeight());

			if (bufferImage == null)
				System.out.println("생성 실패");
			else
				buffg = bufferImage.getGraphics();
		}

	}

	@Override
	public void update(Graphics g) {
		buffg.drawImage(bufferImage, 0, 0, this);// 버퍼세팅
		//
		buffg.setColor(new Color(41, 128, 185));
		buffg.fillRect(0, 0, getWidth(), getHeight());
//
		
		
		buffg.setColor(Color.red);
		buffg.fillOval(ball.getPosX(), ball.getPosY(), ball.getSize(), ball.getSize());

		g.drawImage(bufferImage, 0, 0, this); // 버퍼에있는거 그려주기
	} // 43번쨰 줄부터 52번쨰줄은 껌뻑거림을 없애기위한 코드 , 이해할 필요는 없고 buffg 변수 뒤에 세팅값은
	// 기존의 canvas 그리듯 사용하면 됨. 실제로 깜빡거림 방지는 요즘 기술에는 구현되어있어서 굳이 깊게 안봐도댐

	class MoveLeftRight extends Thread {

		// 좌우 왓다리 갔다리 , 숫자는 프레임창의 크기 값 - 동그라미크기(50) 을 뺴준값
		@Override
		public void run() {

			while (true) {

				
				ball.move();
				
				
				if (ball.getPosX() > getWidth() - 50 || ball.getPosX() < 0) {

					ball.setSpeedX(ball.getSpeedX()*-1);
				}
				if (ball.getPosY()> getHeight() - 50 || ball.getPosY() < 0) {

					ball.setSpeedY(ball.getSpeedY()*-1);
				}

				repaint();

				try {
					Thread.sleep(5);
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}

	}

}
