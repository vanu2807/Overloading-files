package overloading;
//super keyword

public class This1 extends This{
public void methodb() {
	System.out.println("i am good");
}
public void methodc() {
	super.methoda();   //parent class is extend here in child class
}
public static void main(String[] args) {
	This1 ob= new This1();
	ob.methodc();
	ob.methodb();
	
	
	
}
}
