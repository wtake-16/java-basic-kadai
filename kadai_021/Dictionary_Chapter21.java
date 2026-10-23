package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void SearchDictionary(String[] fruits) {
		HashMap<String, String> word = new HashMap<String, String>();
		word.put("apple","りんご");
		word.put("peach","桃");
		word.put("banana","バナナ");
		word.put("lemon","レモン");
		word.put("pear","梨");
		word.put("kiwi","キウィ");
		word.put("strawberry","いちご");
		word.put("grape","ぶどう");
		word.put("muscat","マスカット");
		word.put("cherry","さくらんぼ");
		
		
		for( int i = 0; i < fruits.length; i++ ) {
			if( word.containsKey(fruits[i])) {
				System.out.println(fruits[i] + "の意味は" + word.get(fruits[i]) );
			} else {
				System.out.println(fruits[i] + "は辞書に存在しません");
			}
			
		}
		
		
	}

}
