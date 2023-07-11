
public class RealToIntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int apple = 1;
    double pieceUnit = 0.1;
    double result = 1 - 7*pieceUnit;      //0.3이나 실수연산으로 인하여 0.3이 나오지 않는다 그러므로 하기의 정수변환연산등으로 처리
    System.out.println(result);
    
    int apple2 = 10;
    int pieceunit2 = 1;
    int result2 = apple2 - 7*pieceunit2;
    System.out.println(result2/10.);
    
    
	}

}
