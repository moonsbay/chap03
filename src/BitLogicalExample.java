
public class BitLogicalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0b1111_1000;
		int num2 = 0b0001_1111;
		/*
		 * & : 0001_1000 = 24
		 * | : 1111_1111 = 255
		 * ^ : 1110_0111 = 231
		 */
		int result1 = num1 & num2;
		int result2 = num1 | num2;
		int result3 = num1 ^ num2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		
	}

}
