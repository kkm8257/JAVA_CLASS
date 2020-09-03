package frame_Random_ball__Multi_ball;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class MyCanvas extends Canvas {
	Image bufferImage;
	Graphics buffg;

	// ��ü ���������� �缳��

	MoveLeftRight th1;
//	Ball ball;

	ArrayList<Ball> ball_box = new ArrayList<>();

	public MyCanvas(int posX, int posY) {
		
		
		//���������� Ȥ��  ���� �߰��ϴ� �κ��� �޼ҵ�� ���Ѿ� �߰�����

		ball_box.add(new Ball(100, 100, 5, 8, 50, Color.BLACK));
		ball_box.add(new Ball(100, 50, 12, 5, 50, Color.BLACK));
		ball_box.add(new Ball(100, 50, 4, 10, 50, Color.BLACK));
		ball_box.add(new Ball(100, 50, 6, 13, 50, Color.BLACK));
		ball_box.add(new Ball(100, 50, 15, 11, 50, Color.BLACK));
//		ball=new Ball(100,100,5,8,50,Color.BLACK);

		th1 = new MoveLeftRight();
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
		for (int i = 0; i < ball_box.size(); i++) {
			buffg.setColor(Color.red);
			buffg.fillOval(ball_box.get(i).getPosX(), ball_box.get(i).getPosY(), ball_box.get(i).getSize(), ball_box.get(i).getSize());
		}
		g.drawImage(bufferImage, 0, 0, this); // ���ۿ��ִ°� �׷��ֱ�
	} // 43���� �ٺ��� 52�������� �����Ÿ��� ���ֱ����� �ڵ� , ������ �ʿ�� ���� buffg ���� �ڿ� ���ð���
		// ������ canvas �׸��� ����ϸ� ��. ������ �����Ÿ� ������ ���� ������� �����Ǿ��־ ���� ��� �Ⱥ�����

	class MoveLeftRight extends Thread {

		// �¿� �Ӵٸ� ���ٸ� , ���ڴ� ������â�� ũ�� �� - ���׶��ũ��(50) �� ���ذ�
		@Override
		public void run() {

			while (true) {

				for (int i = 0; i < ball_box.size(); i++) {

					ball_box.get(i).move();

					if (ball_box.get(i).getPosX() > getWidth() - 50 || ball_box.get(i).getPosX() < 0) {

						ball_box.get(i).setSpeedX(ball_box.get(i).getSpeedX() * -1);
					}
					if (ball_box.get(i).getPosY() > getHeight() - 50 || ball_box.get(i).getPosY() < 0) {

						ball_box.get(i).setSpeedY(ball_box.get(i).getSpeedY() * -1);
					}

					
					try {
						Thread.sleep(5);
					} catch (Exception e) {
						System.out.println(e);
					}
					repaint();

				}

			}

		}

	}

}
