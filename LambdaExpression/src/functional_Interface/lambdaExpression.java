package functional_Interface;

//@FunctionalInterface
interface Vehicle{
	public void running();
}
public class lambdaExpression {
	public static void main(String[] args) {
		Vehicle v=()->System.out.println("Bike is running");
		v.running();
	}   
}
