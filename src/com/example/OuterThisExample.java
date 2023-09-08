package com.example;

public class OuterThisExample {
    int num = 100;
    static int num2 = 200; 
    
    class A {
    	void xxx() {
    		num = num + 10;
    		num2 = num2 + 20;
    	}
    }
    
    static class B {
    	void xxx() {
//    		num = num + 10;
    		num2 = num2 +20;
    	}
    }
    
    void print() {
    	class D {
    		void xxx() {
    			num = num + 40;
    		}
    		static void yyy() {
//    			num = num + 50; (X)
    		}
    	}
    }

	public static void main(String[] args) {
       class C {
    	   void xxx() {
//    		   num = num +30; (X)
    		   num2 = num2 + 30;
    	   }
       }
	}

}
