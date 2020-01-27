package hasequalsumchecker;

public class HasEqualSumChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hasEqualSum(1,1,1); //false
		//hasEqualSum(1,1,2); //true
		hasEqualSum(1,-1,0); //true

	}

	public static boolean hasEqualSum(int x, int y, int z) {
		//
		if (x + y != z) {
			System.out.println("NO: " + x + " + " + y + " = " + z);
			return false;
		} 
		System.out.println("Has: " + x + " + " + y + " = " + z);
		return true;
	}
}
