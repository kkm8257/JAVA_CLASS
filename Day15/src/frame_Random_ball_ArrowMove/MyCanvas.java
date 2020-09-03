package frame_Random_ball_ArrowMove;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class MyCanvas extends Canvas {
	Image bufferImage;
	Graphics buffg;

	
	//��ü ���������� �缳��

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
				System.out.println("���� ����");
			else
				buffg = bufferImage.getGraphics();
		}

	}

	@Override
	public void update(Graphics g) {
		buffg.drawImage(bufferImage, 0, 0, this);// ���ۼ���
		//
		buffg.setColor(new Color(41, 128, 185));
		buffg.fillRect(0, 0, getWidth(), getHeight());
//
		
		
		buffg.setColor(Color.red);
		buffg.fillOval(ball.getPosX(), ball.getPosY(), ball.getSize(), ball.getSize());

		g.drawImage(bufferImage, 0, 0, this); // ���ۿ��ִ°� �׷��ֱ�
	} // 43���� �ٺ��� 52�������� �����Ÿ��� ���ֱ����� �ڵ� , ������ �ʿ�� ���� buffg ���� �ڿ� ���ð���
	// ������ canvas �׸��� ����ϸ� ��. ������ �����Ÿ� ������ ���� ������� �����Ǿ��־ ���� ��� �Ⱥ�����

	class MoveLeftRight extends Thread {

		// �¿� �Ӵٸ� ���ٸ� , ���ڴ� ������â�� ũ�� �� - ���׶��ũ��(50) �� ���ذ�
		@Override
		public void run() {

			while (true) {

				
				
				
			

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
