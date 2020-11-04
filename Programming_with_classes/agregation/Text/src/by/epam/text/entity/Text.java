package by.epam.text.entity;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
*/
import java.util.ArrayList;
import java.util.List;

public class Text {

	private String title;
	private List<Sentence> text = new ArrayList<Sentence>();
	
	public Text() {
		
	}

	
	public Text(String title, List<Sentence> text) {
		super();
		this.title = title;
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public void addText(Sentence sentence) {
		this.text.add(sentence);
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}

}
