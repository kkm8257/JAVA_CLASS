package frame_Random_ball;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class MyCanvas extends Canvas {

	int posX = 0;
	int posY = 0;
	int speedX = 8;
	int speedY = 15;
	MoveLeftRight th;

	Image bufferImage;
	Graphics buffg;

	public MyCanvas(int posX,int posY) {

		
		this.posX =posX;
		this.posY=posY;
		
		th = new MoveLeftRight();
		th.start();
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

//		g2.fillOval(posX, 300, 50, 50);
	}

	@Override
	public void update(Graphics g) {
		buffg.drawImage(bufferImage, 0, 0, this);// 버퍼세팅
		//
		buffg.setColor(new Color(41, 128, 185));
		buffg.fillRect(0, 0, getWidth(), getHeight());
//
		buffg.setColor(Color.red);
		buffg.fillOval(this.posX, this.posY, 50, 50);

//		buffg.fillOval(100, 100, 50, 50);

		g.drawImage(bufferImage, 0, 0, this); // 버퍼에있는거 그려주기
	} // 43번쨰 줄부터 52번쨰줄은 껌뻑거림을 없애기위한 코드 , 이해할 필요는 없고 buffg 변수 뒤에 세팅값은
	// 기존의 canvas 그리듯 사용하면 됨. 실제로 깜빡거림 방지는 요즘 기술에는 구현되어있어서 굳이 깊게 안봐도댐

	class MoveLeftRight extends Thread {

		// 좌우 왓다리 갔다리 , 숫자는 프레임창의 크기 값 - 동그라미크기(50) 을 뺴준값
		@Override
		public void run() {

			while (true) {

				posX += speedX;
				posY+=speedY;
				if (posX > getWidth() - 50 || posX < 0) {

					speedX *= -1;
				}
				if (posY> getHeight() - 50 || posY < 0) {

					speedY *= -1;
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
