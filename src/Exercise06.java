
public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5;
		double y = 0;
		double z = x % y;
		
		if(Double.isNaN(z)) {
			System.out.println("0으로 나눌수 없습니다");
		} 
		else {
			z = z + 10;
			System.out.println(z);
			
		}
		
		
		
	}

}
