package com.inflearn.javastudy.algorithm;

public class Recursion {
	// 자기 자신을 호출하는 method를 Recursion이라한다.
	// 자기 자신을 호출하고 그렇게 호출된 자신이 또 자신을 호출하기 때문에
	// recursion은 다른 조건을 붙여주지 않으면 무한 반복된다. 
	public static void main(String[] args) {
		
		int result = fnc2(4);	// 4+3+2+1+0의 결과로 result에 10을 저장
		System.out.println(result);
	}
	
	public static void fnc1(int i) {
		if(i<=0) {
			return;		//base case: recursion에 빠지지 않는 case, 적어도 하나의 base case가 존재해야함
		}else {
			System.out.println("Recursion");
			fnc1(i-1);	// Recursion case: 재기되는 case 반복하다 보면 결국 base case로 수렴하도록 짜여져야함
		}
	}
	
	public static int fnc2(int i) {
		if(i<=0) {
			return 0;
		}else {
			return i+fnc2(i-1);
		}
	}
	
	public static int fibonacci(int i) {
		if(i<2) {
			return i;
		}else {
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}	// recursion을 통한 피보나치수 구현
	
	public static int factorial(int i){
		if(i==0) {
			return 1;
		}else {
			return i*factorial(i-1);
		}
	}	// recursion을 통한 !(펙토리알)의 구현
	
	public static int gcd(int i, int i2) {
		if(i<i2) {
			int tmp = i; i = i2; i2 = tmp;	// swap i and i2
		}
		if(i%i2==0) {
			return i2;
		}else {
			return gcd(i2, i%i2);
		}	// 최대 공약수의 구현
	}
	
}
