// Polymorphism 
public class Sum {
	
	public int sum (int x, int y) {
		return x + y;
	}
	
	public int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	public double sum(double x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s = new Sum();
		
		System.out.println(s.sum(20, 30));
		System.out.println(s.sum(20, 30, 40));
		System.out.println(s.sum(20.5, 1));
	}

}
