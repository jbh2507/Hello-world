package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{	// 14, 15행은 파일이 없을 경우에 발생할 수 있을 경우에 발생하는 Exception을 발생시키기 때문에 try,catch로 묶어줘야댐
			fis = new FileInputStream("src/JavaIO/ByteExam.java");
			fos = new FileOutputStream("byte.txt");	// 아무런 경로를 주지 않고 파일명만 주면 해당 프로젝트 폴더 내에 Output
			
			int readCount = -1;
			byte[] buffer = new byte[512];	// 512짜리 단일행 byte배열 선언
			
			while((readCount = fis.read(buffer)) != -1) {	// file 내에 데이터가 없을 경우 -1을 반환하므로 -1이 될때까지 반복문 작성
				fos.write(buffer,0,readCount);	// buffer에 0번째부터 시작해서 readCount만큼 써달라(readCount가 읽은 횟수를 가지고있음)
			}	//이와 같이 시행시 한 번에 최대 512 Byte까지 읽어오므로 시행 시간이 1 Byte씩 읽어올때보다 훨씬 빠름
				// 왜냐하면 현재 사용하는 대부분의 운영체계에서는 1Byte씩 읽어오라해도 512Byte를 읽어오고 나머지 511Byte는 버리는 방식으로 작동하기 때문
				// 따라서 한 번에 512Byte 배수만큼 읽어오는게 효율적이다
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	// javaIO객체들은 모두 최종적으로 close해줘야함
			try {	// 닫는거 또한 Exception을 발생시키므로 try로 묶어준다
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
