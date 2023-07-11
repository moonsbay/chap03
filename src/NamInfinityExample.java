
public class NamInfinityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 0;
//		int result = num1/num2;  //에러

		double d1 = 5;
		double d2 = 0;
		double result1 = d1 / d2;
		double result2 = d1 % d2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(Double.isInfinite(result1));
		System.out.println(Double.isNaN(result2));
		System.out.println(result1 == Double.POSITIVE_INFINITY);
		System.out.println(result2 == Double.NaN);   // 연산자로 확인 안됨으로 상기 Double.isNan()함수를 사용
	}

}
