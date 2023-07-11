
public class OperatorDirectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3 - 2 + 4 + 6 ;
				
		System.out.println(num);
		
		int n1;
		int n2;
		int n3;
		
		n1 = n2 = n3 = 10;  // n3부터 10으로 채워짐  대입연산자 "=" 방향공부
		
		boolean tf = !!!!!!!!true;    // 오른쪽에서 왼쪽으로 계산  <----
		System.out.println(tf);
		
		int num2 = +~+0; // 오른쪽에서 왼쪽으로 계산  <----    +~+~-~-~+
		System.out.println(num2);
		
		int num3;
		num3 = 023; // 8진수
		System.out.println(num3);
		
//		long num4 = 3000 * 3000 * 3000;  //연산식을 int로 함으로 범위 over됨
		long num4 = 3000L * 3000 * 3000; 
		long num5 = 3000 * 3000 * 3000 * 1L;
		long num6 = 3000 * 3000L * 3000;
		long num7 = 3000 * 3000 * 3000L;
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
		
	}

}
