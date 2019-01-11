package JavaIO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
				){
			int i = in.readInt();
			boolean bool = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(bool);
			System.out.println(d);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
				
	}

}
