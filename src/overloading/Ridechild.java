package overloading;
//method overriding
public class Ridechild extends Riding {
	
@Override
public void rd() {
	System.out.println("I am working in Concentrix");
}
public static void main(String[] args) {
	Ridechild rs = new Ridechild();
	rs.rd();
	
}








}
