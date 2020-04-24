//поиск повторяющихся слов в тексте
public class HelloWorld {
    public static void main(String[] args) {
	String str = ("Какой сегодня день, чудесный день!").toLowerCase();
	String[] words = str.split("\\s");
	for(String subStr:words) {
        System.out.println(subStr); 
	}
  }
}