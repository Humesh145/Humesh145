package Construtor;

public class Contructors {
	public Contructors() {
		System.out.println("Default con");
		// TODO Auto-generated method stub

	}
	public Contructors(String a) {
		System.out.println(a);
		// TODO Auto-generated method stub

	}
	
public static void main(String[] args) {
	Contructors s = new Contructors();
	Contructors s1 = new Contructors("11");
}
}
