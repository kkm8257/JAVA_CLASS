import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public void createFiles() {
//		FileOutputStream output = null;
//		String data = "�����ٶ� ���ѹα�";
//		/****************** ù ��° ��� ***********************/
//		/** ������ ���� �̸��� ���� **/
//		try {
//			output = new FileOutputStream("c:/my/test1.txt");
//		
//			data = "������ �ҳ�\r\n";
//			output.write(data.getBytes()); // ���Ͽ� ����
//
//			data = "������\r\n";
//			output.write(data.getBytes()); // ���Ͽ� ����
//
//			data = "�������������\r\n";
//			output.write(data.getBytes()); // ���Ͽ� ����
//			output.close();
//			System.out.println("��������");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		/****************** �� ��° ��� ***********************/
//		File tempFile = new File("c:/my/test2.txt"); 
//		if(tempFile.exists()== true) {			//���� ���� ���� Ȯ��
//		}
//		 FileWriter fw;		
//		 try {
//			fw = new FileWriter("c:/my/test2.txt", false); //����� , true �ٿ�����
//			String data = "Ƽ���\r\n";			
//			 fw.write(data);		
//			 data = "� ���ϱ�? �ȳ�\r\n";
//			 fw.write(data);			
//			 fw.close();
//			 System.out.println("��������");
//		} catch (IOException e) {		
//			e.printStackTrace();
//		}
		
	

		//
		// /** �ٿ����� �ϴ� ��� **/
		// FileWriter fw2 = new FileWriter("c:/test2.txt", true);
		//
		// data = "��ν�\r\n";
		// fw2.write(data);
		//
		// data = "����\r\n";
		// fw2.write(data);
		//
		// data = "�� �����\r\n";
		// fw2.write(data);
		//
		// fw2.close();
		//
		/**************** ���� �д� ��� ********************/
//		 ����Ʈ�� �б�
		 byte[] b = new byte[1024];
		 FileInputStream input;
		 try {
		 input = new FileInputStream("c:/my/test2.txt");
		 input.read(b);
		 String str = new String(b);
		 System.out.println(str);
		 input.close();
		 } catch (FileNotFoundException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 } catch (IOException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		try {
			// �� �پ� �б�
			BufferedReader br = new BufferedReader(new FileReader("c:/my/test2.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
