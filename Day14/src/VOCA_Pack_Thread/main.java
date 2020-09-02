package VOCA_Pack_Thread;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		ArrayList<Voca> myVoca = new ArrayList<>();
		Control ctr = new Control();
//		SharePart sh_total = new SharePart();

		ctr.openFile(myVoca);


//		ctr.read(myVoca);

		Player A=new Player();
		Player B=new Player();
		
		A.name="Kim";
		B.name="Park";
		
		ctr.init(A, B,myVoca);
		


	}

}
