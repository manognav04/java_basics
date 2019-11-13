
public class ReverseString {

	public static String reverseString(String in) {
		if(in == null)
			return null;
		
		StringBuilder out = new StringBuilder();
		
		int length = out.length();
		
		for(int i = length-1; i >= 0; i--) {
			out.append(in.charAt(i));
		}
		
		return out.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("Mano"));
		System.out.println(reverseString("family"));
	}

}
