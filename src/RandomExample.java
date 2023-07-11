
public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random());
		
		System.out.println((int)(Math.random()*6));
		// 1. 주사위 [1~6] 이나 상기는 0~5까지 밖에 안나옴
		System.out.println((int)(Math.random()*6)+1);
		// 1을 더해서 1~6이 나오게 한다
		
		// 예 [30~37] --> [0-7]+30 
		System.out.println((int)(Math.random()*8)+30);
		
		// [A-Z]  [0-25] + 'A'
		char ch = (char)(Math.random()*26 + 'A');
		System.out.println(ch);
		
		// [1-45]  --> [0-44]+1
		System.out.println((int)(Math.random()*45)+1);
	}

}
