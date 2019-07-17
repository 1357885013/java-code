package WordExtra;

import java.awt.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class wordExtra {
    public static void begin(TextArea textArea) {
        Set<String> s = new TreeSet<>();
        Pattern words = Pattern.compile("((?:[^a-zA-Z])[a-z]{2,})|([A-Z][a-z]+)|([A-Z]{2,})");
        Pattern words1 = Pattern.compile("([A-Za-z]+)");

        Matcher result = words.matcher(textArea.getText());
        Matcher result1;
        int count = 0;
        while (result.find()) {
            count++;
            result1 = words1.matcher(result.group());
            if (result1.find()) {
                s.add(result1.group().toLowerCase());
                //System.out.print(result1.group().toLowerCase()+"|  |");
            } else
                textArea.append("??" + result.group() + "|  |\n");
        }
        textArea.append("");
        textArea.append("共扫描单词:" + count + "个\n");

        textArea.append(s + " " + s.size()+"\n");
		
		/*StringTokenizer st = new StringTokenizer(text," ,?.!:\"\"''\n#");
		ArrayList<String> wordList = new ArrayList<>();
		while (st.hasMoreElements()) 
		{
		    wordList.add(st.nextToken().toLowerCase());
		}
		System.out.print(wordList);*/
    }
}
