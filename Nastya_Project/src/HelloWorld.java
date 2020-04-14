//вывести элементы массива в обратном порядке

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] a = {5, 10, 12,}; 	
		int temp = a[0];
        a[0] = a[2];
        a[2] = temp;
		{
		String intArrayString = Arrays.toString(a);
		System.out.println(intArrayString);
		}
	}	
}