
public class HelloWorld {

	public static void main(String[] args) {
	    int a[] = new int[3];
	    a[0] = 5;
	    a[1] = 10;
	    a[2] = 12;
	    int res = 0;
	    for(int i = 0;i < a.length;i++)
		if (a[i] > res)
		    res = a[i];
	    System .out.println(res);
	    	    	}
}
