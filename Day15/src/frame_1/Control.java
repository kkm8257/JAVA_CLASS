package frame_1;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Control {

	public void init() {

		Frame frame = new Frame("첫 AWT");
		setLayout(frame);

		frame.setLayout(null);
		//배치관리자 제거 , 기본 레이아웃 세팅을 없애겠다는 것 , 내 마음대로 세팅하기위해
		
		MyCanvas can = new MyCanvas();
		can.setSize(500,500);
		can.setLocation(150,150);
		frame.add(can);
		frame.setVisible(true);

	}

	public void setLayout(Frame frame) {

		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("해상도 : " + res.width + " x " + res.height);

		int frame_width = 800;
		int frame_height = 800;

		frame.setSize(frame_width, frame_height);

		frame.setLocation(res.width / 2 - frame_width / 2, res.height / 2 - frame_height / 2);

		// 왼쪽으로 가로의 절반만큼, 위쪽으로 세로의 절반만큼
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
