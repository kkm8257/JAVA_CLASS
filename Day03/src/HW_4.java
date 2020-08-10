import java.util.Scanner;

public class HW_4 {

	public static void main(String[] args) {

		boolean flag = true;
		boolean firstflag = true;

		Scanner sc = new Scanner(System.in);

		float result = 0;
		float num=0;
		int count=0;
		
		String[] CheckBox = new String[100];
		
		String sign;

		System.out.println("------------계산기------------");

		
		
		
		while (flag) {

			if(firstflag==true) {
				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				
				result=num;
				firstflag=false;
				CheckBox[count]=Float.toString(result);
				count++;
			}
			
			
			System.out.print(
					"\n기호 입력(     ' + '     or     ' - '     or     ' * '     or     ' / '     or     ' = ') :        ");
			sign = sc.nextLine();
			if(!(sign.equals("+")||sign.equals("-")||sign.equals("/")||sign.equals("*")||sign.equals("=") )) {
				
				System.out.println("입력오류");
				continue;
				
			}
				

			CheckBox[count]=sign;
			count++;
			System.out.println();

			if (sign.equals("+")) {
				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				CheckBox[count]=Float.toString(num);
				count++;
				result=result+num;
				

			} else if (sign.equals("-")) {
				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				CheckBox[count]=Float.toString(num);
				count++;
				result=result-num;
				

			} else if (sign.equals("*")) {

				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				CheckBox[count]=Float.toString(num);
				count++;
				result=result*num;

			} else if (sign.equals("/")) {
				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				CheckBox[count]=Float.toString(num);
				count++;
				result=result/num;

			}else if(sign.equals("=")) {

				
				break;
			}
			 
			
		
			
		}
		
		for(int i =0; i <CheckBox.length;i++) {
			if(CheckBox[i]!=null) {
				System.out.print(CheckBox[i]+ "  ");
				
			}
			
		}
		
		System.out.println(result);
		

	}

}
