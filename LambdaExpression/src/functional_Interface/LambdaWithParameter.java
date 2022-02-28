package functional_Interface;

@FunctionalInterface 
interface Cab{
	public String car(String a,String b);
}
public class LambdaWithParameter {
	public static void main(String[] args) {
		
   Cab c=(a,b)->{System.out.println("Cab booked from "+a+" "+b);
               return "Reched";};
   System.out.println(c.car("bangalore", "chennai"));
}

}