package kr.co.programers.javastudy.dataStructure.arraylist;
// java 내부에 ArrayList가 어떻게 구현되어있는지 살펴보는 Class

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[512];
	// private 접근제한자를 가진 Object 타입의 512의 크기를 가지는 배열 elementData 객체를 생성
	// ArrayList내부에서도 Array를 사용해서 사이즈가 고정되어 있지만 이를 초과하여 데이터를 입력할 경우 내부코드로 이 크기를 늘리도록 코딩이 되어있음
	
	public boolean add(int index, Object element) {
		Object value = elementData[size-1]; 
		for(int i = size-1; i >= index; i--) {
			elementData[i+1] = elementData[i];
		}
		
		elementData[index] = element;
		size++;
		
		return elementData[index] == element && value.equals(elementData[size-1]);
	}
		
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	public boolean addLast(Object element) {
		elementData[size] = element;	// elemetData의 현재 size값의 슬롯에 생성자로 들어온 element를 넣음
		size++;							// 그리고 size++ 시킴 이렇게하면 다음에 해당 메소드를 다시 실행시키면 다음 슬롯에 해당 값이 들어감
		
		return elementData[size-1] == element;	// 생성자의 값이 실제로 마지막 슬롯에 들어갔는지 boolean값을 반환
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < size; i++) {
			sb.append(elementData[i]);
			if(i < size-1) {
				sb.append(", ");
			}
		}
		
		return "{"+sb.toString()+"}";
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object element) {
		for(int i = 0; i < size; i++) {
			if(element.equals(elementData[i])) {
				return i;
			}
		}
		
		return -1;
	}
}
