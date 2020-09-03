package frame_1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyCanvas extends Canvas {

	@Override
	public void paint(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		
		setBackground(new Color(41, 128, 185));
		g2.setColor(Color.white);
		g2.drawRect(100, 100, 80, 80); //�ٷ� ���� �簢��
		g2.fillRect(200, 150, 80, 80);//���� �簢��
		g2.drawOval(100, 200, 50, 50); //���׶�� ��
		g2.fillOval(150, 250, 50, 50); //���� ���׶��
		
		
		g2.drawLine(100, 200, 300,300);  //���� �߱�
	}

}
