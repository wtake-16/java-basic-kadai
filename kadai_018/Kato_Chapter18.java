package kadai_018;

abstract public class Kato_Chapter18 {
	
	String familyName = "加藤";
	String givenName;
    String address = "東京都中野区〇×";
	
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName +  "です");
		System.out.println("住所は" + address + "です");
		
	}
	
	
	abstract public void eachIntroduce();
	
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println(" ");
		
	}

}
