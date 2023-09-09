import java.util.*;
public class Pangram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Please enter your sentence ");
		String input = sc.nextLine();
		if(input.length() < 26) {
			System.out.println("Not Pangram");
		}else {
			input = input.toLowerCase();
			int count = 0;
			boolean isPangram = true;

			for(int i = 0; i < alphabet.length(); i++) {
				for(int j = 0; j < input.length(); j++) {
					if(input.charAt(j) >= 'a' && input.charAt(j) <= 'z') {
						if(alphabet.charAt(i) == input.charAt(j)) {
							count++;
						}
					}
				}
				if(count == 0){
						isPangram = false;
						break;
					}
				count = 0;
			}
			if(isPangram){
				System.out.println("Is pangram");
			}else{
				System.out.println("Not Pangram");
			}

		}

	}
}
