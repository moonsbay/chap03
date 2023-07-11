
public class ComplexAssignmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		
		num = num + 10;
		num += 10;
				
		System.out.println(num);
		
		int num2 = 100;
		num2 *= 2 + 3;           // 우선순위가 대입연산자 보다 덧셈이 먼저..
		System.out.println(num2);
	}

}
