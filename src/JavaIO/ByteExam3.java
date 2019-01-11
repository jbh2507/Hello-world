package JavaIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {
		// Exception이 발생하지 않았다면 자동으로 Close시켜주는 방법
		// try-with-resources(사용한 자원을 자동으로 종료시켜주는 기능)
		try(	// ()안에다 IO객체 선언
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				// DataOutputStream은 생성자로 OutputStream을 매개변수로 받아들임
				// 이는 OutputStream의 자손이라면 다 받아들일 수 있다는 뜻
				// 이렇게 DataOutputStream 생성자 내부에 다른 클래스를 선언하여 사용해야하는 경우 DataOutputStream은 장식기능을 한다고 한다
				// 장식하는 클래스는 여러 method를 제공하고 내부 생성자에 들어가는 클래스는 어디에 어떻게 사용되는지 지정한다
				) {
			out.writeInt(100);			// 정수는  4Byte
			out.writeBoolean(true);	// boolean 1Byte
			out.writeDouble(500.5);	// Double은 8Byte를 차지
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
