package sist.com.basic.di2;

public class TestJava {
	
	public void add(String str) {
		System.out.println("add(String str)");
	}
	public void add(int i) {
		System.out.println("add(int i)");
	}
	/*public void add(int ii) {
		System.out.println("add(int ii)");
	}*/
	public static void main(String[] args) {
		TestJava j=new TestJava();
		j.add(100);
	
	} 

}





