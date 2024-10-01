
public class Summa {
	public static void main(String[]args) {

		String s="Gowtham";
		
		int vowel=0;
		int novowel=0;
		
		String lc = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char f=s.charAt(i);
			
			if (f=='a'||f=='e'||f=='i'||f=='o'||f=='u') {
				vowel++;
			}
			else{
				novowel++;
			}
		}
	
		System.out.println("vowels "+vowel);
		System.out.println("No vowels "+novowel);
		
		
		
		
		
	
	}

}
