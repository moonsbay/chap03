
public class LogicalExample {

	public static void main(String[] args) {
		System.out.println("#####");
		System.out.println("# AND");
		System.out.println("#####");
		System.out.println("T && T =" + (true && true));
		System.out.println("T && F =" + (true && false));
		System.out.println("F && T =" + (false && true));
		System.out.println("F && F =" + (false && false));// "+" 기호의 연산이 더 빨라져서 true && true에 괄호가 없으면 error
		System.out.println("# OR");
		System.out.println("T || T =" + (true || true));
		System.out.println("T || F =" + (true || false));
		System.out.println("F || T =" + (false || true));
		System.out.println("F || F =" + (false || false));
		System.out.println("# XOR");
		System.out.println("T ^ T =" + (true ^ true));
		System.out.println("T ^ F =" + (true ^ false));
		System.out.println("F ^ T =" + (false ^ true));
		System.out.println("F ^ F =" + (false ^ false));
		// TODO Auto-generated method stub

	}

}
