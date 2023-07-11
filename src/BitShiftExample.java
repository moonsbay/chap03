
public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0b0000_0001;
		
		int result1 = num << 1; // 2
		int result2 = num << 2; // 4
		int result3 = num << 4; // 16
		int result4 = num << 10;
		int result5 = num >> 1;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
			}

}
