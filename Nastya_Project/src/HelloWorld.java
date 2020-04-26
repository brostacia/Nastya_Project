//поиск повторяющихся слов в тексте

import java.util.*;

class Word
{
    String word = "";
    int count = 0;
}

public class HelloWorld {
    public static void main(String[] args) {
	String str = ("Какой сегодня день, чудесный день!").toLowerCase().replaceAll("[^a-zA-Zа-яА-Я]", " ");
	String[] words = str.split("\\s+");
	List<Word> occurrences = new LinkedList();
	for(String subStr:words) {
        occurrences.add(subStr);
        count++;
       if (count > 1) 
    	   System.out.println(occurrences);
	}
   }
}
