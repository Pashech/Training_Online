package by.epam.text.view;

import by.epam.text.entity.Sentence;
import by.epam.text.entity.Text;
import by.epam.text.entity.Word;

public class ViewText {

	public void showText(Text text) {

		for (Sentence s : text.getText()) {
			System.out.println(s + " ");
		}
	}

}
