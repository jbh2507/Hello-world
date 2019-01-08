package kr.co.programers.javastudy2;

public class GenericExam1<E> {	// GenericExam1은 Generic을 사용하여 가상 타입 'E'를 사용하겠다고 선언 
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj(){
		return obj;
	}
}
