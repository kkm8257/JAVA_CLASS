import java.util.ArrayList;
import java.util.Random;

public class Map {
	
	
	ArrayList<Room> makedMap = new ArrayList<>();
	Random rd = new Random();
	int tempRd;
	int tempValue;
	public Map(int size) {
		
		for(int i =0;i<size;i++) {
			tempRd=rd.nextInt(9);  //ÀÌº¥Æ® ·»´ý ·ê·¿
			makedMap.add(new Room(tempRd,tempValue));  //¸ÊÆÇ¿¡ »ý¼ºÀÚ if¹®¿¡¸Â´Â ¹ßÆÇ »ý¼º
			
			
			
		}
		
	}

}
