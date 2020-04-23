//Вывести на экран все символы, которые в строке встречаются больше одного раза.

public class HelloWorld {
    public static void main(String[] args) {
	String str = ("Какой прекрасный день, и светит солнце!").toLowerCase();
	int[] letters = new int['я'];
	for(int i = 0;i < letters.length;i++)
	    letters[i] = 0;
	for(int i = 0;i < str.length();i++)
	    letters[str.charAt(i)]++;
    }  
 }
