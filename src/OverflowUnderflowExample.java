
public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bmax = Integer.MAX_VALUE;
		int bmin = Integer.MIN_VALUE;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("bmax="+ bmax);
		System.out.println("bmax="+ bmax);
		
		System.out.println("max="+ max);
		System.out.println("min="+ min);
		
		System.out.println("++max="+ ++max);   //overflow   error도 안남
		System.out.println("--min="+ --min);   //underflow
	}

}
