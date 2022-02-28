package predicte;
import java.util.function.Predicate;
public class predicate<T> {
public static void main(String[] args) {
	// Ex-1-When return type is boolean then we directly use predicate lambda expression
	// When you hav conditional check in program
	Predicate<Integer> p=(i)->(i>10);
	System.out.println(p.test(3));
	//
	//Ex-2-
	Predicate<String>s=(names)->(names.length()>4);
	System.out.println(s.test("JAYAA"));
	
	String [] name= {"jay","jayya","amit","Shweta"};
	for (String s1:name) {
		if(s.test(s1)) {
			System.out.println(s1);
		}
		
	}
}

}