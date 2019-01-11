package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{	// 14, 15행은 파일이 없을 경우에 발생할 수 있을 경우에 발생하는 Exception을 발생시키기 때문에 try,catch로 묶어줘야댐
			fis = new FileInputStream("src/JavaIO/ByteExam.java");
			fos = new FileOutputStream("byte.txt");	// 아무런 경로를 주지 않고 파일명만 주면 해당 프로젝트 폴더 내에 Output
			
			int readData = -1;
			
			while((readData = fis.read()) != -1) {	// file 내에 데이터가 없을 경우 -1을 반환하므로 -1이 될때까지 반복문 작성
				fos.write(readData);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	// javaIO 객체들은 모두 최종적으로 close해줘야함
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
