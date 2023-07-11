
public class IncrementDecrementExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(++num1);      // 11
		System.out.println(num2++);      // 10
		System.out.println(num2);        // 11
		
	}
	
	
	
	public static void main1(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		int result1 = ++num1 + 10;
		int result2 = num2++ + 10;
		
		System.out.println(num1);      // 11
		System.out.println(num2);      // 11
		System.out.println(result1);   // 21
		System.out.println(result2);   // 20
		

		
	}
	
	
	
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		++num;
		System.out.println(num);
		
		num++;
		System.out.println(num);
	}

}
