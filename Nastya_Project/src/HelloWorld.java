//Вывести на экран все символы, которые в строке встречаются больше одного раза.

public class HelloWorld {
	public static void main(String[] args) {
		String str = "Какой прекрасный день, и светит солнце!";
		char[] chArray = str.toCharArray();
		      
        for(int i=0;i<chArray.length;i++){
            char ch1 = chArray[i];
            for (int j=i+1; j<chArray.length; j++){
                if(ch1==chArray[j]){
                    System.out.println(ch1);
                }
            }
	   }
   }
}
