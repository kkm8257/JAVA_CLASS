package test_jframe;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class jframe_main {
	public static void main(String[] args) {

		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("해상도 : " + res.width + " x " + res.height);
		JFrame jf = new JFrame();
		
		int frame_width=300;
		int frame_height=300;

		jf.setSize(frame_width, frame_height);
		
		jf.setLocation(res.width/2-frame_width/2, res.height/2-frame_height/2);
		
		//왼쪽으로 가로의 절반만큼, 위쪽으로 세로의 절반만큼

		jf.setVisible(true);
	}

}
