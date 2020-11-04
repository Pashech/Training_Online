package by.epam.text.main;

import java.util.ArrayList;
import java.util.List;

import by.epam.text.entity.Sentence;
import by.epam.text.entity.Text;
import by.epam.text.entity.Word;
import by.epam.text.view.ViewText;

public class Main {

	public static void main(String[] args) {

		Word word = new Word();
		Text text = new Text();
		Sentence sentence = new Sentence();
		ViewText view = new ViewText();

		Sentence tittle = new Sentence();
		tittle.add(new Word("Topic"));
		tittle.add(new Word("about"));
		tittle.add(new Word("Java"));

		Sentence sentence1 = new Sentence();
		sentence1.add(new Word("Java"));
		sentence1.add(new Word("is"));
		sentence1.add(new Word("very"));
		sentence1.add(new Word("popular"));
		sentence1.add(new Word("programming"));
		sentence1.add(new Word("language"));
		sentence1.add(new Word("in"));
		sentence1.add(new Word("the"));
		sentence1.add(new Word("world."));

		Sentence sentence2 = new Sentence();
		sentence2.add(new Word("I"));
		sentence2.add(new Word("like"));
		sentence2.add(new Word("it"));

		text.addText(sentence1);
		text.addText(sentence2);

		view.showText(text);
	}

}
