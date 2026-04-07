package basic;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		LLOperation ll = new LLOperation();
		ll.insertFront("Ramanth");
		ll.addLast("Shetty");
		ll.addLast("Ashwin");
		ll.addLast("Fahhh");

		ll.middleInsert("KK", "Fahhh" );
		ll.printList();
		
	}		
}