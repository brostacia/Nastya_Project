//Вывести на экран все символы, которые в строке встречаются больше одного раза.

public class HelloWorld {
    public static void main(String[] args) {
	String str = ("Какой прекрасный день, и светит солнце!").toLowerCase();
	char[] chArray = str.toCharArray();
	
	//массив такой длины, сколько букв в русском языке. По умолчанию заполняется нулями.
	int Zero[];
	Zero = new int[33];
		
    //по строке
    for(int i=0;i<chArray.length;i++){
    	int index=0;
    	Zero[index] += 1;
    	}    	
    System.out.println(Zero);
    }  
 }