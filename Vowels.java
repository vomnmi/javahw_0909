import java.util.*;
public class Vowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int vowelCount = 0;
		System.out.println("Please enter your sentence ");
		String input = sc.nextLine();
			input = input.toLowerCase();
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
					input.charAt(i) == 'i' || input.charAt(i) == 'o' ||
					input.charAt(i) == 'u') {
					vowelCount++;
				}
			}
			System.out.println("Vowels Count is " + vowelCount);
		
		}

	}
