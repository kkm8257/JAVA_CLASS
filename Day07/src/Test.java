

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
		
		String inputStr=""; //한줄입력
		
		String[] tempArray;  //쪼개서 넣을 배열
		int count =0;
		//몽땅 공백일때 는 ???
		//몽땅 공백이 아니고, 모음이 존재할때
		//몽땅 공백이 아니고, 모음이 존재 하지 않을때   ???
	
		for(int i= 0  ; i < Case;i++) {
			
			//테스트 케이스 만큼 반복
			inputStr=br.readLine();
			tempArray=inputStr.split("");   //한줄의 문자열 쪼개서 배열에 저장
			for ( int j =0; j<tempArray.length;j++) {//쪼개진 문자열 첫글자부터
				
				for(int k =0; k <Moeum.length;k++) {//모음배열과 검사시작
					
					
					if(Moeum[k].equals(tempArray[j])) {
						
//						
						count++; 
						bw.write(Moeum[k]);
						
					}
					
				}
				
			}
			
			if(count==0) {
				//저장된게 없다고 판단. 즉 모음이없음
				bw.write("???");
			}
			count=0;
			
			
			bw.write("\n");
			
			
		}

		bw.flush();
	}

}
