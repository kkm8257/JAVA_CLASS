package frame_Random_ball_remake;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Control {

	
	public Control() {
		
		Frame fr=new Frame();
		
		setLayout(fr);
		
		MyCanvas cv = new MyCanvas(100,100);
		
		cv.setSize(600,600);
		cv.setLocation(0,0);
		
		fr.add(cv);

		fr.setVisible(true);
		
		
	}
	
	public void setLayout(Frame frame) {
		//중앙에 위치
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("해상도 : " + res.width + " x " + res.height);

		int frame_width = 600;
		int frame_height = 600;

		frame.setSize(frame_width, frame_height);

		frame.setLocation(res.width / 2 - frame_width / 2, res.height / 2 - frame_height / 2);

		frame.setLayout(null);
		
		//
		
		
		
		
	}
	
	
	
	
}
