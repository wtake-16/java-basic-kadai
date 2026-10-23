package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
				
		while (true) {
			
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				
				scanner.close();
				return input;
				
			} else {
				
				System.out.println("エラー");
				continue;
			}
			
			//scanner.close();
			
		 }	
	    		
	}
	
	public String getRandom() {
		
		String[] hand = {"r", "s", "p"};
		
		int num = (int)Math.floor(Math.random() * 3);
		
		return hand[num];
		
	}
	
	public void playGame() {
		
		HashMap<String,String> chart = new HashMap<String,String>();
		chart.put("r", "グー");
		chart.put("s", "チョキ");
		chart.put("p", "パー");
		
		String me = getMyChoice();
		String you = getRandom();
		
		System.out.println("自分の手は" + chart.get(me) + ",対戦相手の手は" + chart.get(you));
		
		if (me.equals(you)) {
			
			System.out.println("あいこです");
			
		} else if (( me.equals("r") && you.equals("s") ) || ( me.equals("s") && you.equals("p")) || ( me.equals("p") && you.equals("r") )) {
			
			System.out.println("自分の勝ちです");
			
		} else {
			
			System.out.println("自分の負けです");
			
		}
		

		
		
	}

}
