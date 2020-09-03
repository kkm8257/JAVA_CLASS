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
				System.out.println("���� ����");
			else
				buffg = bufferImage.getGraphics();
		}

//		g2.fillOval(posX, 300, 50, 50);
	}

	@Override
	public void update(Graphics g) {
		buffg.drawImage(bufferImage, 0, 0, this);// ���ۼ���
		//
		buffg.setColor(new Color(41, 128, 185));
		buffg.fillRect(0, 0, getWidth(), getHeight());
//
		buffg.setColor(Color.red);
		buffg.fillOval(this.posX, this.posY, 50, 50);

//		buffg.fillOval(100, 100, 50, 50);

		g.drawImage(bufferImage, 0, 0, this); // ���ۿ��ִ°� �׷��ֱ�
	} // 43���� �ٺ��� 52�������� �����Ÿ��� ���ֱ����� �ڵ� , ������ �ʿ�� ���� buffg ���� �ڿ� ���ð���
	// ������ canvas �׸��� ����ϸ� ��. ������ �����Ÿ� ������ ���� ������� �����Ǿ��־ ���� ��� �Ⱥ�����

	class MoveLeftRight extends Thread {

		// �¿� �Ӵٸ� ���ٸ� , ���ڴ� ������â�� ũ�� �� - ���׶��ũ��(50) �� ���ذ�
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
