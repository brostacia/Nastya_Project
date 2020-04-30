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
	List<Word> occurrences = new LinkedList<Word>();
	for(String i: words){
	    boolean found = false;
	    for(Word w: occurrences)
		if (w.word.equals(i))
		{
		    w.count++;
		    found = true;
		    break;
		}
	    if (found)
		continue;
	    final Word w = new Word();
	    w.word = i;
	    w.count = 1;
	    occurrences.add(w);
	}
	for(Word w: occurrences)
	    System.out.println(w.word + ": " + w.count);
    }
}
