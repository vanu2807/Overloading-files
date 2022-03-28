package overloading;
//overloading

public class Loading {
	public void methodA( int a) {
		System.out.println(a);
	}
	public void methodA(int b, int c) {
		System.out.println(b+" "+c);
	}
public void methodA(double d)	{
	System.out.println(d);
}
public static void main(String[] args) {
	Loading ld= new Loading();
	ld.methodA(29);
	ld.methodA(48, 25);
	ld.methodA(3.4589);

}
}
