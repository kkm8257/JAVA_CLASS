

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		int Case = Integer.parseInt(br.readLine());
		
		String [] Moeum = new String [10];
		Moeum[0]="a";
		Moeum[1]="A";
		Moeum[2]="e";
		Moeum[3]="E";
		Moeum[4]="i";
		Moeum[5]="I";
		Moeum[6]="o";
		Moeum[7]="O";
		Moeum[8]="u";
		Moeum[9]="U";
		
		String inputStr=""; //�����Է�
		
		String[] tempArray;  //�ɰ��� ���� �迭
		int count =0;
		//���� �����϶� �� ???
		//���� ������ �ƴϰ�, ������ �����Ҷ�
		//���� ������ �ƴϰ�, ������ ���� ���� ������   ???
	
		for(int i= 0  ; i < Case;i++) {
			
			//�׽�Ʈ ���̽� ��ŭ �ݺ�
			inputStr=br.readLine();
			tempArray=inputStr.split("");   //������ ���ڿ� �ɰ��� �迭�� ����
			for ( int j =0; j<tempArray.length;j++) {//�ɰ��� ���ڿ� ù���ں���
				
				for(int k =0; k <Moeum.length;k++) {//�����迭�� �˻����
					
					
					if(Moeum[k].equals(tempArray[j])) {
						
//						
						count++; 
						bw.write(Moeum[k]);
						
					}
					
				}
				
			}
			
			if(count==0) {
				//����Ȱ� ���ٰ� �Ǵ�. �� �����̾���
				bw.write("???");
			}
			count=0;
			
			
			bw.write("\n");
			
			
		}

		bw.flush();
	}

}
