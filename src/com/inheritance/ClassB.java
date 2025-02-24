package com.inheritance;

public class ClassB extends ClassA {
	
	public void EmpNum() {
		System.out.println("EmpNum is 8353");
	}
	public static void main(String[]agrs) {
		
		ClassB child=new ClassB();
		
		child.EmpNum();
		
		child.EmpName();
		
		child.EmpId();
		
		child.EmpSalary();
	}

}
