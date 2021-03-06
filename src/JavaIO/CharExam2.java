package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CharExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		PrintWriter pw = null;
		try{
			br = new BufferedReader(new FileReader("src/javaIO/CharExam2.java"));
			pw = new PrintWriter(new FileWriter("test.txt"));	
			// PrintWriter로 장식안하고 바로 써도 작동함(예제라 장식보여줄라고 해놓은 것)
			String line = null;
			
			while((line = br.readLine()) != null) {
			// .readLine();은 읽어낼 값이 없을때 null을 반환
				
				pw.println(line);	// line 값을 pw를 통해 println
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
