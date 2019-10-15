package alien;

public class Test {
	public static void main(String[] args) {
	//Word wordobj= new Word("aaa","Ciao");
	AlienDictionary adobj= new AlienDictionary();
	adobj.addWord("aaa","tiao");
	adobj.addWord("aaa","aiao");
	adobj.addWord("bbb","heyiao");
	adobj.addWord("BBB","aidsaao");
	
	
	adobj.stampa();
	System.out.println(adobj.translateWord("ccc"));
	System.out.println(adobj.translateWord("aaa"));
}
}