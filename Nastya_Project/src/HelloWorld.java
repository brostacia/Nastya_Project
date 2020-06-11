import java.io.IOException;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		//Дано слово состоящее из букв в любом регистре. Необходимо вывести на экран таблицу в соответствии с примером:
		//Пусть слово = "abcde", тогда таблица должна быть вот такой -
		//a b c d e
		//b 0 0 0 d
		//c 0 0 0 c
		//d 0 0 0 b
		//e d c b a
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] ch = s.toCharArray();	
		char[][] doubCh = new char [ch.length][ch.length];
		
		for(int i=0; i<doubCh.length; i++) { //строки
			for(int j=0; j<doubCh[i].length; j++) { //колонки
				for(int k=0; k<ch.length; k++) { //буквы
					if (i==0) {
						doubCh[i][j] = ch[k];
					} else if (i==ch.length-1)  {
						doubCh[i][j] = ch[k];
					} else if (j==0)  {
						doubCh[i][j] = ch[k];
					} else if (j==ch.length-1)  {
						doubCh[i][j] = ch[k];
					} else {
					doubCh[i][j] = '0';	
				}
			}
		}
	}
			 	
		for(int i=0; i<doubCh.length; i++) { //строки
			for(int j=0; j<doubCh[i].length; j++) { //колонки
			System.out.print(doubCh[i][j]+" ");
			}
			System.out.println();
		}
	}
}