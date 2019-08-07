package intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	
	public static void main(String[] args) {
		
		System.out.println("\n\nStep 1:\n");
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> AL = new ArrayList<String>();
		
		System.out.println("\n\nStep 2:\n");
		//2. Add five Strings to your list
		for (int i = 0; i < 5; i++) {
			AL.add(String.valueOf(i + 1));
		}
		
		System.out.println("\n\nStep 3:\n");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			System.out.println(AL.get(i));
		}
		
		System.out.println("\n\nStep 4:\n");
		//4. Print all the Strings using a for-each loop
		for (Object str : AL) {
			System.out.println(str);
		}
		
		System.out.println("\n\nStep 5:\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 1) {
				System.out.println(AL.get(i));
			}
		}
		
		System.out.println("\n\nStep 6:\n");
		//6. Print all the Strings in reverse order.
		for (int i = 4; i > -1; i--) {
			System.out.println(AL.get(i));
		}
		
		System.out.println("\n\nStep 7:\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for (String str : AL) {
			if (str.contains("e")) {
				System.out.println(str);
			}
		}
	}
}
