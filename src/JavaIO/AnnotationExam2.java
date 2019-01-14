package JavaIO;

import java.lang.reflect.Method;

public class AnnotationExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationExam anno = new AnnotationExam();
		
		try {
			Method method = anno.getClass().getDeclaredMethod("method");
			
			if(method.isAnnotationPresent(Count100.class)) {
			// .isAnnotationPresent();  특정 Annotation이 해당 method 적용되어있는지 bool값을 반환하는 method
				for(int i = 0; i < 100; i++) {
					anno.method();
				}
			}else {
				System.out.println("@Count100 is not presented...");
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
