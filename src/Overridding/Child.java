package Overridding;

public class Child extends Parent   {

	@Override
	public void property() {
		// TODO Auto-generated method stub
		System.out.println("Child's show()");
	}
	public static void main(String[] args) {
		Parent b = new Parent();
		b.property();
		Child c = new Child();
		c.property();
				
	}
}
