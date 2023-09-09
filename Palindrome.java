public class Polindrom {
	public static void main(String args[]) {
		String s = "A man, a plan, a canal: Panama";
		StringBuilder sb = new StringBuilder("");
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				sb.append(s.charAt(i));
			}
		}
		if(sb.reverse().toString().equals(sb.toString())) {
			System.out.println("Is polindrom");
		}
		System.out.println(sb);
	}
}