//вывести элементы массива в обратном порядке

public class HelloWorld {
	public static void main(String[] args) {
		int a[] = new int[3]; 
		a[0] = 5;
		a[1] = 10;
		a[2] = 12;
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}