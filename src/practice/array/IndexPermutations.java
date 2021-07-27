package practice.array;

public class IndexPermutations {
	public static void main(String[] args) {
		
		int[] a = {1,2,5,3,4};
		boolean isP = isPermutation(a);
		System.out.println("Is permutation ? " + isP);
	}
	
	public static boolean isPermutation(int[] a) {
		int  length = a.length;
		
		for(int i = 0 ; i < length ; i++) {
			
			int indexFromValue = Math.abs(a[i]);
			
			if(a[indexFromValue] < length && a[indexFromValue]>=0) {
				a[indexFromValue] = a[indexFromValue] * -1;
			}else {
				return false;
			}
		}
		
		int zeroCount = 0;
		for(int i = 0 ; i < length ; i++) {
			if(a[i] == 0)
				zeroCount++;
			if(zeroCount > 1)
				return false;
		}
		return true;
	}
}