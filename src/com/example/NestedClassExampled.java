package com.example;


class Alpha {
	
}

public class NestedClassExampled {
	int n1;   // 인스턴트 필드, 힙, new
	static int n2;   //메소드 영역(Code영역)
    
	class A { // 인스턴스 맴버 클래스
		
	}
	
	class B { // 정적(static) 맴버 클래스
		
	}
	
	public static void main(String[] args) {
//		n1 = 100;  (X)
		n2 = 200;
       int n3;   // 로컬변수, 스택변수, 자동변수, 임시변수
        
       NestedClassExampled x = new NestedClassExampled();
       x.n1 = 100;
       
       class C { // 로컬 클래스
    	   
       }
       
       
	}

}
