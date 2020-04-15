//Вывести на экран все символы, которые в строке встречаются больше одного раза.

public class HelloWorld {
	public static void main(String[] args) {
		String str = ("Какой прекрасный день, и светит солнце!").toLowerCase();   
		 
        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            for (int j=i+1; j<str.length(); j++){
            	char ch2 = str.charAt(j);
            	if(ch1==ch2){
            		System.out.println(ch1);
			    	break;
            }
	   }
   }
}
}
