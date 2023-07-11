
public class TerneryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		double r1 = Math.random();  // [0. ~1)
		System.out.println(r1);
		System.out.println(r1*100);
		System.out.println((int)(r1*100));
		
		int num = (int)(Math.random()*100);
		System.out.println(num);
        System.out.println(num%2 == 0 ? "짝수" : "홀수");
	}

}
