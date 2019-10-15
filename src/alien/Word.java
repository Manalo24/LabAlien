package alien;

public class Word {
	private String alienWord;
	private String translation;
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}
	public String getAlienWord() {
		return alienWord;
	}
	public String getTranslation() {
		return translation;
	}
	/*public boolean equals(String s) {
		boolean cerca;
		return cerca=alienWord.equals(s);
	}*/
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	@Override
	public String toString() {
		return "Word [alienWord=" + alienWord + ", translation=" + translation + "]";
	}
	
	
}
