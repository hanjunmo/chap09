package com.example;

//class Alpha { {(X)
//
//}


public class OuterClassExample {
   protected class A { // 인스턴스 맴버 클래스
	   int n1;
	   static int n2;
    }
    
   protected static class B { // 정적 맴버 클래스
    	int n1;
    	static int n2;
    }
	
	public static void main(String[] args) {
		OuterClassExample o = new OuterClassExample();
		A a = o.new A();
		B b = new B();
		
		class C {  // 로컬 클래스
    	   int n1;
    	   static int n2;
       }
       
       C c = new C();
       
	}

}
