public class Problem1 {
	
	public static void main(String[] args) {
		
		char[] alphaArray = new char[26];
		int convert = 65;
		
		for (int i=0; i<alphaArray.length; i++) {
			alphaArray[i] = (char) convert;
			convert++;
			System.out.println(alphaArray[i]);
		}
		
	}
	
}
