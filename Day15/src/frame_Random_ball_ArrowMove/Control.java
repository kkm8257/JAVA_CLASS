package frame_Random_ball_ArrowMove;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Control {

	
	public Control() {
		
		Frame fr=new Frame();
		
		setLayout(fr);
		
		MyCanvas cv = new MyCanvas(100,100);
		
		cv.setSize(600,600);
		cv.setLocation(0,0);
		
		cv.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyCode());
				
				
				//�� 37 �� 38 �� 39 �� 40
				switch (e.getKeyCode()) {
				
				case 37 : 
					System.out.println("��");
					cv.ball.setPosX(cv.ball.getPosX()-10);
					break;
				case 38 : 
					System.out.println("��");
					cv.ball.setPosY(cv.ball.getPosY()-10);
					break;
				case 39 : 
					System.out.println("��");
					cv.ball.setPosX(cv.ball.getPosX()+10);
					break;
				case 40 : 
					System.out.println("��");
					cv.ball.setPosY(cv.ball.getPosY()+10);
					break;
				
				}
				
			}
		});
		
		
		
		fr.add(cv);

		fr.setVisible(true);
		
		
	}
	
	public void setLayout(Frame frame) {
		//�߾ӿ� ��ġ
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("�ػ� : " + res.width + " x " + res.height);

		int frame_width = 600;
		int frame_height = 600;

		frame.setSize(frame_width, frame_height);

		frame.setLocation(res.width / 2 - frame_width / 2, res.height / 2 - frame_height / 2);

		frame.setLayout(null);
		
		//
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
	}
	
	
	
	
}
