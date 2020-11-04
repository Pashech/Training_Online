package by.epam.regular_expression.main;

/*Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег, 
закрывающий тег, содержимое тега, тег без тела). 
Пользоваться готовыми парсерами XML для решения данной задачи нельзя.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_02 {

	public static void main(String[] args) {
		
		String xml = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";
		
		String[] xmlArray = xml.split("\\n");

		StringBuilder stringBuilder = new StringBuilder();

		Pattern openTeg = Pattern.compile("<[\\w=\"\\s]+>");
		Pattern closeTeg = Pattern.compile("<(/+[\\w]+?)>");
		Pattern emptyTeg = Pattern.compile("<(\\w+/)>");
		Pattern content = Pattern.compile("[а-яА-ЯЁё\\s[.,!?]?]+[!.?,]?");

		for (String str : xmlArray) {

			Matcher openingTeg = openTeg.matcher(str);
			if (openingTeg.find()) {
				stringBuilder.append("Открывающий тег: ").append(openingTeg.group());

			}

			Matcher isEmptyTag = emptyTeg.matcher(str);
			if (isEmptyTag.find()) {
				stringBuilder.append(isEmptyTag.group()).append(" тег без тела");
			}
			
			Matcher contentTeg = content.matcher(str);
			if (contentTeg.find() && !contentTeg.group().equals(" ")) {
				stringBuilder.append(" Содержимое тега: ").append(contentTeg.group()).append(" ");
			}

			Matcher closingTeg = closeTeg.matcher(str);
			if (closingTeg.find()) {
				stringBuilder.append(closingTeg.group()).append(" закрывающий тег");
			}

			

			stringBuilder.append("\n");
		}

		System.out.println(stringBuilder);

	}
}


	