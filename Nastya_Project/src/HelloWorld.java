//Вывести на экран все символы, которые в строке встречаются больше одного раза.

public class HelloWorld {
	public static void main(String[] args) {
		String str = ("Какой прекрасный день, и светит солнце!").toLowerCase();
		int countLeft = 0;
		int countRight = 0;
		int countnew = 0;
		
		for(int i=0;i<str.length();i++){
        	for (int j = 0;j < str.length();j++) {
        		if (str.charAt(i) != str.charAt(j)) 
        			continue; 
        		if (j < i) 
        			countLeft++; 
        		if (j > i)
        			countRight++; 
        		if (countLeft == 0 & countRight > 0)
        			System.out.println(str.charAt(j));
		}
	}
}	
}		
	