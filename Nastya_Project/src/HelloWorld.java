public class HelloWorld {
    public static void main(String[] args) {
	String str = ("Какой прекрасный день, и светит солнце!").toLowerCase();
	
	int[] letters = new int['я' + 1];
	for(int i = 0;i < letters.length;i++)
	    letters[i] = 0;
	for(int i = 0;i < str.length();i++)
	    letters[str.charAt(i)]++;	
	for(int i = 0;i < str.length();i++)
		if (letters[str.charAt(i)] > 1)		
	System.out.println(str.charAt(i));
 }
}