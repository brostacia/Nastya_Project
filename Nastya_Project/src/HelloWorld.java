//вывести элементы массива в обратном порядке

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
	    int count = 0;
	    String str = "Какой прекрасный день!";
	    for(int i = 0;i < str.length();i++)
		if (str.charAt(i) == ' ')
		    count++;
	    		System.out.println(count);
	}
}	
