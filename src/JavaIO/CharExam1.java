package JavaIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.in은 Input클래스라 Reader클래스만을 받을 수 있는 BufferReader로 장식 할 수 없다.
		// 따라서 Reader클래스 이면서도 Input클래스를 생성자로 받는 InputStreamReader으로 한 번 장식한 후에 생성자로 넣어 사용한다.
		String line = null;
		try{
			line = br.readLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(line);
		
		}
}
