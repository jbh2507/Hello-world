package kr.co.programers.javastudy.dataStructure.arraylist;

public class Main {

		public static void main(String[] args) {
			
			ArrayList numbers = new ArrayList();
			numbers.addLast(10);
			numbers.addLast(20);
			numbers.addLast(30);
			numbers.addLast(40);
			if(numbers.addLast(50)) {
				System.out.println("is work");
				System.out.println(numbers.get(3));
			}
			
			if(numbers.add(1, 15)) {
				System.out.println(numbers.getAll());
			}
		}
}
