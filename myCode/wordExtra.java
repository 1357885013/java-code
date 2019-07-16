package myCode;

import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class wordExtra 
{
	public static void main(String[] args) 
	{
		String text = "";
		Set<String> s = new TreeSet<>();
		Pattern words = Pattern.compile( "((?:[^a-zA-Z])[a-z]+)|([A-Z][a-z]+)|([A-Z]+)");
		Pattern words1 = Pattern.compile( "([A-Za-z]+)");

		Matcher result = words.matcher(text);
		Matcher result1;
		int count=0;
		while(result.find())
		{
			count++;
			result1=words1.matcher(result.group());
			if(result1.find())
			{
				s.add(result1.group().toLowerCase());
				//System.out.print(result1.group().toLowerCase()+"|  |");
			}
			else
				System.out.print("??"+result.group()+"|  |");
		}
		System.out.println();
		System.out.println("共扫描单词:"+count+"个");
		
		System.out.println(s+" "+s.size());

		
		
		/*StringTokenizer st = new StringTokenizer(text," ,?.!:\"\"''\n#");
		ArrayList<String> wordList = new ArrayList<>();
		while (st.hasMoreElements()) 
		{
		    wordList.add(st.nextToken().toLowerCase());
		}
		System.out.print(wordList);*/
	}
}
