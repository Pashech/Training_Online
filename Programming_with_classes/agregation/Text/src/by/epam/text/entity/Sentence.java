package by.epam.text.entity;

import java.util.List;
import java.util.ArrayList;

public class Sentence {

	private List<Word> sentence = new ArrayList<Word>();

	public Sentence() {

	}

	public Sentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public List<Word> getSentence() {
		return sentence;
	}
	
	public void add(Word word) {
		this.sentence.add(word);
	}

	@Override
	public String toString() {
		return sentence + " ";
	}
	
	

}
