package alien;

import java.util.*;







public class AlienDictionary {
	private List <Word> Dizionario;
	private boolean esiste=false;
	private int index;
	private  static int x=0;
	
public AlienDictionary() {
		
		Dizionario=new  ArrayList<Word>();
	}
	
public void addWord(String alienWord, String translation) {
	if (x==0) {
		
		Dizionario.add(new Word(alienWord,translation));
		x=1;
	} else {
		
		ifExists(alienWord);
		if (esiste==false) {
			Dizionario.add(new Word(alienWord,translation));
			
				
			} else {
				
				Dizionario.get(index).setTranslation(translation);
			}
	}
	
	
	}
	
		


public void ifExists(String alienWord) {
	
		
	 
	for (int i=0;i<Dizionario.size();i++) {
		if (Dizionario.get(i).getAlienWord().equalsIgnoreCase(alienWord)) {
			
			index=i;
			esiste=true;
		} else {
			esiste=false;
			
		}
	
	}
}
public String translateWord(String alienWord) {
	ifExists(alienWord);
	if(esiste=true) {
		for (int i =0;i<Dizionario.size();i++) {
			if (Dizionario.get(i).getAlienWord().equalsIgnoreCase(alienWord)) {
				
				return Dizionario.get(i).getTranslation();
			}
		}
			}
	return null;
}
public void stampa() {
	Iterator<Word> i=Dizionario.iterator();
    while (i.hasNext()) {
    	System.out.println(i.next());
    }
}
}
